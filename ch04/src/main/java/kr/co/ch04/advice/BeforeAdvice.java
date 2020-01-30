package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class BeforeAdvice {
	
	public void before1() {
		System.out.println("횡단관심 - before1...");
	}
	
	public void before2() {
		System.out.println("횡단관심 - before2...");
	}
	
	public void before3() {
		System.out.println("횡단관심 - before3...");
	}
	
}
