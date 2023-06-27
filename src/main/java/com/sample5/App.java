package com.sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("sample5-ctx.xml");
		
		NotificationService service = context.getBean(NotificationService.class);
		
		service.noticeEvent(new String[] {"홍길동", "김유신", "강감찬"},
										"백화점 상품팀",
										"할인행사 안내", 
										"7월1일부터 여름상품 파격할인을 개시합니다.");
	}
}
