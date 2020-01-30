package kr.co.jcinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketingController {
	
	@RequestMapping("/ticketing/choice-movie")
	public String choiceMovie() {
		return "/ticketing/choice-movie";
	}
	@RequestMapping("/ticketing/choice-seat")
	public String choiceSeat() {
		return "/ticketing/choice-seat";
	}
	@RequestMapping("/ticketing/order-confirm")
	public String orderConfirm() {
		return "/ticketing/order-confirm";
	}
	@RequestMapping("/ticketing/order-result")
	public String orderResult() {
		return "/ticketing/order-result";
	}
	
	
	public void getTheater() {
		
	}
	
	
}
