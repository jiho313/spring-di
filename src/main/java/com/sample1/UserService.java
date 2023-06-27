package com.sample1;

/*
 * 의존성 주입받기
 * 		- UserService 객체는 OracleUserDao 객체가 필요하다.
 * 			+ OracleUserDao 타입의 멤버변수를 정의한다.
 * 		- UserService 객체는 OracleUserDao 객체를 직접 생성하지 않고,
 * 		  외부로부터 주입(전달, 제공) 받는다.
 * 			+ OracleUserDao 타입의 매개변수가 있는 생성자 메서드 혹은
 * 			  OracleUserDao 타입의 매개변수가 있는 Setter 메서드를 정의한다.
 * 		- UserService 객체의 회원가입 기능, 회원탈퇴 기능에서는
 * 		  OracleUserDao 객체의 데이터베이스 액세스 기능을 사용하기 위해서는
 * 		  UserService 객체에 OracleDao 객체가 주입이 완료되어야 한다.
 */
public class UserService {
	
	// 1. 의존하는 객체를 참조하는 인스턴스 변수
	private OracleUserDao oracleUserDao;
	
	public UserService () {}
	
	// 2. 의존하는 객체를 전달받아서 인스턴스 변수에 대입하는 생성자 메서드를 정의한다. 혹은
	//	  생성자 주입
	public UserService(OracleUserDao oracleUserDao) {
		this.oracleUserDao = oracleUserDao;
	}
	
	// 2. 의존하는 객체를 전달받아서 인스턴스 변수에 대입하는 Setter 메서들르 정의한다.
	//	  Setter 주입
	public void setOracleUserDao(OracleUserDao oracleUserDao) {
		this.oracleUserDao = oracleUserDao;
	}
	
	public void 회원가입(String id, String password, String name) {
		oracleUserDao.inserUser();
	}
	
	public void 회원탈퇴(String id) {
		oracleUserDao.deleteUser();
	}

}
