package kr.co.ch04.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch04.sub2.BoardService;

/*
 * 날짜 : 2020/01/08
 * 이름 : 이다함
 * 내용 : AOP 동작시점실습하기
 */

public class AdviceTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		BoardService bs = (BoardService) ctx.getBean("bs2");
		
		System.out.println("===================");
		bs.insert();
		System.out.println("-------------------");
		
		
		System.out.println("===================");
		bs.select();
		System.out.println("-------------------");
		
		
		System.out.println("===================");
		bs.update(1);
		System.out.println("-------------------");
		
		
		System.out.println("===================");

		try {
			bs.delete(1, null);
		} catch (Exception e) {
			System.out.println("예외발생!");
		}
		
		System.out.println("-------------------");
		
		
	}
}
