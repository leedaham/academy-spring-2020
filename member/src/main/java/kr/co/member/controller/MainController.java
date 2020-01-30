package kr.co.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller component 설정.
 * spring-context.xml 에서 component-scan으로 kr.co.member 하위의 component들을 스캔.
 * 
 *  RequestMapping으로 /member/, /member/index 호출 시 "/index" 를 리턴함.
 */

@Controller
public class MainController {
	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "/index";
	}
}
