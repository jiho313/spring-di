package com.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample3.OracleEmployeeDao;

public class EmailMessageSender implements MessageSender {
	
	private static final Logger logger = LoggerFactory.getLogger(OracleEmployeeDao.class);
 
	private String host;
	private int port;
	private String username;
	private String password;
	
	public EmailMessageSender(String host, int port, String username, String password) {
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
		
		connect();
	}

	private void connect() {
		logger.info("메일 서버 연결 정보");
		logger.info("host: " + host);
		logger.info("port: " + port);
		logger.info("username: " + username);
		logger.info("password: " + password);
		
		logger.info("위의 설정에 맞는 메일서버에 연결이 완료되었습니다.");
	}

	@Override
	public void send(String from, String to, String title, String content) {
		logger.debug("이메일 메세지 발송 시작");
		logger.info("메일발송자: " + from);
		logger.info("메일수신자: " + to);
		logger.info("메일제목: " + title);
		logger.info("메일내용: " + content);
		logger.debug("이메일 메세지 발송 종료");
	}
	
}
