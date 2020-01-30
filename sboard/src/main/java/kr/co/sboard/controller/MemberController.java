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
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.sboard.service.MemberService;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	@PostMapping("/member/login")
	public String login(MemberVO vo, HttpSession session) {
		MemberVO member = service.selectMember(vo);
		
		if(member == null) {
			// 회원이 아닐경우
			return "redirect:/member/login";
		}else {
			// 회원일 경우
			// 세션처리
			session.setAttribute("member", member);
			
			return "redirect:/list";
		}
	}
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login";
	}
	
	@RequestMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVO vo = service.selectTerms();
		model.addAttribute("vo",vo);
				
		return "/member/terms";
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@PostMapping("/member/register")
	public String register(MemberVO vo,HttpServletRequest req) {
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		service.insertMember(vo);
		
		return "redirect:/login"; 
	}
	
	
	/*
	 @ResponseBody
	  - 자바 객체를 HTTP 응답 몸체로 전송함
	  - 자바 객체를 HTTP 요청의 body 내용으로 매핑하는 역할
	  - 출력결과를 View 페이지 포워드로 실행하지 않고 바로 데이터를 response 처리
	 */
	
	@ResponseBody
	@GetMapping("/member/checkUid")
	public String checkUid(String uid){
		
		int result = service.selectUidCount(uid);
		
		JsonObject obj = new JsonObject();
		obj.addProperty("result", result);;
		
		return new Gson().toJson(obj);
	}
	
}
