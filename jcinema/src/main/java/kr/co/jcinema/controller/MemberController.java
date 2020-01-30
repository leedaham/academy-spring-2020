package kr.co.jcinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@RequestMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	@RequestMapping("/member/my-cinema")
	public String myCinema() {
		return "/member/my-cinema";
	}
}
