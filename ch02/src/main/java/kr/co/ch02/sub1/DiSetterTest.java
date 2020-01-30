package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch02.LgTV;
import kr.co.ch02.SamsungTV;
import kr.co.ch02.TV;

/*
날짜 : 2020/01/06
이름 : 이다함
내용 : Ioc DI Setter 구현 실습하기;
*/
public class DiSetterTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV tv1 = (LgTV) ctx.getBean("tv1");
		TV tv2 = (SamsungTV) ctx.getBean("tv2");
		
		tv1.power();
		tv1.chUp();
		tv1.soundUp();
		
		tv2.power();
		tv2.chUp();
		tv2.soundUp();
	}
}
