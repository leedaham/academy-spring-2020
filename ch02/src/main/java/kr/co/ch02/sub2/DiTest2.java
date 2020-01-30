package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
날짜 : 2020/01/07
이름 : 이다함
내용 : 생성자 DI 구현 실습하기
*/

public class DiTest2 {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV tv3 = (LgTV) ctx.getBean("tv3");
		
		tv3.power();
		tv3.chUp();
		tv3.soundUp();
		
		TV Samsung = (SamsungTV) ctx.getBean("tv4");
		Samsung.power();
		Samsung.chUp();
		Samsung.soundUp();
		
	}
}
