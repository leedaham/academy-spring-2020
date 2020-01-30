package kr.co.ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("itn")
public class Internet {
	
	public void access() {
		System.out.println("인터넷 연결...");
	}
}
