package com.sample2;

public class Container {
	
	public static void main(String[] args) {
		
		// 1. 애플리케이션 실행에 필요한 객체 생성하기
		MySqlProductDao mySqlProductDao = new MySqlProductDao();
		CloudProductDao cloudProductDao = new CloudProductDao();
		
		// 2. 객체들간의 의존관계를 분석해서 생성자 메소드로 의존성 주입하기
		// ProductService productService = new ProductService(cloudProductDao);
				
		// 2. 객체들간의 의존관계를 분석해서 Setter 메소드로 의존성 주입하기
		ProductService productService = new ProductService();
		 productService.setProductDao(cloudProductDao);
		
		// 3. 필요한 객체를 사용해서 업무로직 수행하기
		productService.상품입고처리();
		productService.상품정보변경처리();
	}
}
