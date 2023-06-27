package com.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleEmployeeDao implements EmployeeDao {
	
	private static final Logger logger = LoggerFactory.getLogger(OracleEmployeeDao.class);
	
	@Override
	public void insertEmployee() {
		logger.info("오라클 데이터 베이스에 신규 사원정보를 저장합니다.");
	}
	
	@Override
	public void updateEmployee() {
		logger.info("오라클 데이터베이스에서 사원정보를 변경합니다.");
	}

}
