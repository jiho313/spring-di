package com.sample1;

/*
 * 컨테이너의 역할
 * 		- 애플리케이션 실행에 필요한 객체를 생성한다.
 * 		- 객체들 간의 의존관계를 분석해서 필요한 객체를 생성하고 의존성을 주입한다.
 * 		- 객체들을 관리하고, 업무영역에서 필요한 객체를 요구하면 제공한다.
 */
public class Container {

	public static void main(String[] args) {
		// 1. 애플리케이션 실행에 필요한 객체를 생성한다.
		OracleUserDao oracleUserDao = new OracleUserDao();
		UserService userService = new UserService();
		
		// 2. 객체들 간의 의존관계를 분석해서 의존성을 주입한다.
		userService.setOracleUserDao(oracleUserDao);
		
		// 3. 생성된 객체 사용하기
		userService.회원가입("hong", "zxcv1234", "홍길동");
	}
	
}
