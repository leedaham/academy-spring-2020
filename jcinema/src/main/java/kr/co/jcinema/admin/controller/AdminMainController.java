package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminMainController {
	@RequestMapping(value= {"/admin" , "/admin/index"})
	public String adminIndex() {
		return "/admin/index";
	}
}
