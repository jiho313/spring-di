package com.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
	
	private static final Logger logger = LoggerFactory.getLogger(VideoService.class);
	
	@Value("${video.file.directory}")
	private String directory;
	
	public void download(String filename) {
		logger.info("{} 폴더에서 {} 비디오 파일을 다운로드한다.", directory, filename);
	}
	
}
