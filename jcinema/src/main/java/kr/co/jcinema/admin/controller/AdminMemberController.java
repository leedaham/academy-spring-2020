package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminMemberController {
	@RequestMapping("/admin/member/login")
	public String login() {
		return "/admin/member/login";
	}
}
