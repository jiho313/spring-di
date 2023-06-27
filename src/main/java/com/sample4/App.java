package com.sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample4-ctx.xml"); 
		
		FileService service =  context.getBean("fileService", FileService.class);
		service.upload("a.text");
	}
}
