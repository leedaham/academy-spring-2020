package kr.co.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.member.service.MemberService;
import kr.co.member.vo.MemberVO;

@Controller
public class MemberController {
	
	/*
	 * MemberService를 @Inject component로 주입.   
	 */
	@Inject
	private MemberService service;
	
	/*
	 * @GetMapping 으로 method="get"으로 전달 받는 경우의 매핑.
	 * 다시 /member/register 페이지로 이동.
	 */
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	/*
	 * @PostMapping 으로 method="post"으로 전달 받는 경우의 매핑.
	 * Memberservice 의 insertMember(MemberVO vo); 참조 후 list페이지로 이동.
	 */
	@PostMapping("/member/register")
	public String register(MemberVO vo) {
		
		service.insertMember(vo);
		
		return "redirect:/member/list";
	}
	
	/*
	 * Memberservice 의 selectMembers(); 참조 후 받은 리턴값(List<>)을 
	 * Model 객체에 추가해서 list 페이지로 이동.
	 */
	@RequestMapping("/member/list")
	public String list(Model model) {
		
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members", members);
		
		return "/member/list";
	}
	
	/*
	 * method="get"일 시,
	 * Memberservice 의 selectMember(String uid); 참조 후 받은 리턴값(List<>)을 
	 * Model 객체에 추가해서 modify 페이지로 이동.
	 */
	@GetMapping("/member/modify")
	public String modify(String uid, Model model) {
		
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		
		return "/member/modify";
	}
	
	/*
	 * method="post"일 시,
	 * Memberservice 의 updateMember(MemberVO vo); 참조 후 list페이지로 이동 
	 */
	@PostMapping("/member/modify")
	public String modify(MemberVO vo) {
		
		service.updateMember(vo);
		
		return "redirect:/member/list";
		
	}
	
	/*
	 * Memberservice 의 deleteMember(String uid); 참조 후 list페이지로 이동 
	 */
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);
		return "redirect:/member/list";
	}
}
