package kr.co.ch04.sub2;

import org.springframework.stereotype.Component;

@Component("bs2")
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
		
		char c = uid.charAt(0);
	}
	
}
