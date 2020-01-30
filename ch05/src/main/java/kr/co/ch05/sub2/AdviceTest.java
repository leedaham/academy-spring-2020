package kr.co.ch05.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AdviceTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		BoardService bs = (BoardService) ctx.getBean("bs");
		
		System.out.println("=====================");
		bs.insert();
		
		System.out.println("=====================");
		bs.select();
		
		System.out.println("=====================");
		bs.update(1);
		
		System.out.println("=====================");
		try {
			bs.delete(1, null);
		} catch (Exception e) {
			System.out.println("예외발생!");
		}
		
	}
}
