package kr.co.ch02.sub3;

import org.springframework.stereotype.Component;

@Component("spk3")
public class Speaker {
	public void soundUp() {
		System.out.println("Speaker soundUp...");
	}
	public void soundDown() {
		System.out.println("Speaker soundDown...");
	}
}
