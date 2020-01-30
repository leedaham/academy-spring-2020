package kr.co.ch05.sub1;

import org.springframework.stereotype.Controller;

@Controller
public class BoardService {
	
	public void insert() {
		System.out.println("핵심관심 - insert...");
	}
	
	public void select() {
		System.out.println("핵심관심 - select...");
	}
	
	public void update() {
		System.out.println("핵심관심 - update...");
	}
	
	public void delete() {
		System.out.println("핵심관심 - delete...");
	}
	
}
