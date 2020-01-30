package kr.co.ch05.sub2;

import org.springframework.stereotype.Component;

@Component("bs")
public class BoardService {
	
	public void insert() {
		System.out.println("핵심관심 - insert...");
	}
	
	public void select() {
		System.out.println("핵심관심 - select...");
	}
	
	public void update(int seq) {
		System.out.println("핵심관심 - update...");
	}
	
	public void delete(int seq, String uid) {
		System.out.println("핵심관심 - delete...");
		char ch = uid.charAt(1);
	}
	
}
