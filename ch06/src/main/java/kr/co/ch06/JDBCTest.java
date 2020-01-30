package kr.co.ch06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020/01/13
 * 이름 : 이다함
 * 내용 : 스프링 JDBC 실습하기 
 */

public class JDBCTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		dao.deleteUser();
		System.out.println("DELETE 완료 ...");
	}
}
