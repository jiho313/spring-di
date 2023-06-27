package com.sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		// 스프링 컨테이너 객체 생성하기
		ApplicationContext context = new ClassPathXmlApplicationContext("sample3-ctx.xml");
		/*
		 * 위의 수행문이 실행되고 나면
		 * 		1. 스프링 컨테이너 객체가 생성되었다.
		 * 			ClassPathXmlApplicationContext 객체가 스프링 컨테이너 객체다.
		 * 		2. 빈 설정정보를 읽어서 객체생성, 조립이 완료되었다.
		 * 			- 스프링 컨테이너가 빈 설정정보를 읽어서 
		 * 			  EmployeeService객체와 OracleEmployeeDao객체를 생성하였다.
		 * 			- <property /> 나 <constructor-arg />태그가 있으면 세터/생성자 의존성 주입을
		 * 			  수행해서 객체에게 의존성을 주입하였다.(객체 조립이 완료됨)
		 * 		3. 스프링 컨테이너에서 필요한 객체를 꺼내서 사용할 수 있다.
		 * 
		 */
		
		// 스프링 컨테이너에게 필요한 객체 꺼내기
		EmployeeService service = context.getBean("service1", EmployeeService.class);
		service.신규직원입사처리하기();
		service.직원정보수정하기();
	}

}
