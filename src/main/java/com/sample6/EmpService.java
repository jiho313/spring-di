package com.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpService.class);
	
	private EmpDao empDao;
	private DeptDao deptDao;
	private LocationDao locationDao;
	

	/*
	 * @Autowired
	 * 		- 오토와이어링을 지원하는 어노테이션이다.
	 * 		- 멤버변수, setter 메소드, 생성자, 메소드의 매개변수에 정의할 수 있다.
	 * 		- 스프링 컨테이너는 이 어노테션을 감지하면
	 * 			어노테이션이 멤버변수에 정의되어 있을 때
	 * 				1. 멤버변수의 타입을 조사한다.
	 * 				2. 스프링 컨테이너에 등록된 객체 중에서 
	 * 					이 타입과 일치하는 타입의 객체 혹은 이 타입의 자식타입 객체를 검색한다.
	 * 				3. 객체가 발견되지 않거나, 2개 이상 발견되면 오류가 발생한다.
	 * 				4. 객체가 1개 발견되면 그 객체를 멤버변수에 주입(대입)한다. 
	 * 					setter메소드가 필수는 아님
	 * 			어노테이션이 setter 메소드에 정의되어 있을 때
	 * 			어노테이션이 생성자에 정의되어 있을 때
	 * 				1. setter 메소드와 생성자 메소드의 매개변수 타입을 조사한다.
	 * 				2, 3, 4는 위와 동일하다.
	 */
	@Autowired
	public void setEmpDao(EmpDao empDao) {
		logger.debug("setEmpDao(empDao) 실행됨 - {}", empDao);
		this.empDao = empDao;
	}
	
	@Autowired
	public void setDeptDao(DeptDao deptDao) {
		logger.debug("setDeptDao(deptDao) 실행됨 - {}", deptDao);
		this.deptDao = deptDao;
	}
	
	@Autowired
	public void setLocationDao(LocationDao locationDao) {
		logger.debug("setLocationDao(locationDao) 실행됨 - {}", locationDao);
		this.locationDao = locationDao;
	}

	public void test() {
		
	}
}
