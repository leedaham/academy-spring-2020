package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 날짜 : 2020/01/06
 이름 : 이다함
 내용 : Ioc 실습하기;
*/

public class iocTest {
	
	public static void main(String[] args) {
		
		// Ioc적용 X
		TV ltv = new LgTV();
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		// Spring Ioc 적용 O
		ApplicationContext ctx = new GenericXmlApplicationContext("string-context.xml");
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
