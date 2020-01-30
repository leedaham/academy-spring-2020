package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
날짜 : 2020/01/07
이름 : 이다함
내용 : 어노테이션 기반 DI 실습하기

	어노테이션 종류
	@Component
		-스프링 컨테이너가 해당 어노테이션 선언 클래스를 생성 관리
		-@Controller, @Service, @Repository 로 세분화 된다.
		
	@Autowired
		-참조변수(객체_에 객체를 주입하는 어노테이션
		-스프링 전용 어노테이션
		
	@Inject
		-참조변수(객체_에 객체를 주입하는 어노테이션
		-자바 전용 어노테이션
	
*/

public class TVMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV ltv = (LgTV) ctx.getBean("lgTV");
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV stv = (SamsungTV) ctx.getBean("samsungTV");
		stv.power();
		stv.chUp();
		stv.soundUp();
		
	}
}
