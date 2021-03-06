package kr.co.ch08.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ch08.service.MemberService;
import kr.co.ch08.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@PostMapping("/member/register")
	public String register(MemberVO vo) {
		
		service.insertMember(vo);
		
		return "redirect:/member/list";
	}
	
	@RequestMapping("/member/list")
	public String list(Model model) {
		
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members", members);
		
		return "/member/list";
	}
	

	@GetMapping("/member/modify")
	public String modify(String uid, Model model) {
		
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		
		return "/member/modify";
	}
	@PostMapping("/member/modify")
	public String modify(MemberVO vo) {
		
		service.updateMember(vo);
		
		return "redirect:/member/list";
		
	}
	
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);
		return "redirect:/member/list";
	}
	
}
