package com.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	private EmployeeDao employeeDao;
	
	public EmployeeService() {}
	
	
	public EmployeeService(EmployeeDao employeeDao) {
		logger.debug("생성자 의존성 주입이 실행됨");
		this.employeeDao = employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		logger.debug("세터 의존성 주입이 실행됨");
		this.employeeDao = employeeDao;
	}

	public void 신규직원입사처리하기() {
		employeeDao.insertEmployee();
		logger.info("신규직원 입사처리가 완료됨");
	}
	
	public void 직원정보수정하기() {
		employeeDao.updateEmployee();
		logger.info("직원정보가 수정됨");
	}
	
}
