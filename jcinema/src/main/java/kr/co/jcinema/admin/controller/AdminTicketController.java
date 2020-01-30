package kr.co.jcinema.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminTicketController {
	@RequestMapping("/admin/ticket/generate")
	public String ticketGenerate() {
		return "/admin/ticket/generate";
	}
}
