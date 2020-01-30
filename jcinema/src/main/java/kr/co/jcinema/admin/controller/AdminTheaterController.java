package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminTheaterController {
	@RequestMapping("/admin/theater/register")
	public String theaterRegister() {
		return "/admin/theater/register";
	}
	@RequestMapping("/admin/theater/register-screen")
	public String theaterRegisterScreen() {
		return "/admin/theater/register-screen";
	}
	
}
