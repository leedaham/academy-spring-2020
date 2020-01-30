package kr.co.sboard.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardArticleVO;
import kr.co.sboard.vo.MemberVO;
@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	
	/*
	 Spring에서는 Model 을 쓰는걸 권장하지만
	 (Model model -> model.addAttribute ~~~)
	 HttpServletRequest 사용해도 괜찮음.
	 (HttpServletRequest req -> req.setAttribute ~~~)
	 */
	
	@RequestMapping("/list")
	public String list(HttpServletRequest req, String pg) {

		// 전체 게시물 갯수
		int total = service.getTotalArticle();
		
		// LIMIT 번호
		int start = service.getLimitStart(pg);
		
		// 페이지번호 계산
		int pageEnd = service.getPageEnd(total);
		
		// 글 순서 카운터 번호
		int count = service.getListCount(total, start);
			
		List<BoardArticleVO> articles = service.selectArticles(start);
		req.setAttribute("articles", articles);
		req.setAttribute("pageEnd", pageEnd);
		req.setAttribute("count", count);
		
		return "/list";
	}
	@GetMapping("/write")
	public String write() {
		return "/write";
	}
	@PostMapping("/write")
	public String write(String subject, String content, HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		BoardArticleVO vo = new BoardArticleVO();
		vo.setCate("free");
		vo.setTitle(subject);
		vo.setContent(content);
		vo.setUid(member.getUid());
		vo.setRegip(req.getRemoteAddr());
		
		service.insertArticle(vo);
		
		return "redirect:/list";
	}
	@RequestMapping("/view")
	public String view(int seq, Model model) {
		
		BoardArticleVO article = service.selectArticle(seq);
		
		List<BoardArticleVO> comments = service.selectComment(seq);
		
		model.addAttribute(article);
		model.addAttribute("comments", comments);
		
		return "/view";
	}
	
	@GetMapping("/modify")
	public ModelAndView modify(int seq) {
		
		BoardArticleVO article = service.selectArticle(seq);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("article", article);
		mav.setViewName("/modify");
		
		return mav;
	}
	@PostMapping("/modify")
	public String modify(BoardArticleVO vo) {
		
		service.updateArticle(vo);
		
		return "redirect:/view?seq="+vo.getSeq();
	}
	@RequestMapping("/delete")
	public String delete(int seq) {
		service.deleteArticle(seq);
		return "redirect:/list";
	}
	
	
	@PostMapping("/comment/write")
	public String commentWrite (HttpServletRequest req, String comment, int parent) {
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		String uid = member.getUid();
		String regip = req.getRemoteAddr();
		
		BoardArticleVO vo = new BoardArticleVO();
		vo.setParent(parent);
		vo.setContent(comment);
		vo.setUid(uid);
		vo.setRegip(regip);
		
		service.insertComment(vo);
		
		return "redirect:/view?seq="+parent;
	}
	
	
}
