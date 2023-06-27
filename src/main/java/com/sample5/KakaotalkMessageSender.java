package com.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KakaotalkMessageSender implements MessageSender {
	
	private static final Logger logger = LoggerFactory.getLogger(KakaotalkMessageSender.class);
	
	@Override
	public void send(String from, String to, String title, String content) {
		logger.debug("카톡 메세지 발송 시작");
		logger.info("카톡발송자: " + from);
		logger.info("카톡수신자: " + to);
		logger.info("카톡제목: " + title);
		logger.info("카톡내용: " + content);
		logger.debug("카톡 메세지 발송 종료");
	}
}
