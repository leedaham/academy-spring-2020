package kr.co.ch04.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {

	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("횡단관심 - around1-1...");
		pjp.proceed(); // 핵심관심(포인트컷) 실행
		System.out.println("횡단관심 - around1-2...");
		
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("횡단관심 - around2-1...");
		pjp.proceed(); // 핵심관심(포인트컷) 실행
		System.out.println("횡단관심 - around2-2...");
		
	}
	
	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("횡단관심 - around3-1...");
		pjp.proceed(); // 핵심관심(포인트컷) 실행
		System.out.println("횡단관심 - around3-2...");
		
	}	
}