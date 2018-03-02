package com.spb.cc.spbcc;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 可添加扫描注解，指定扫描的包
 * 默认当前包及子包
 */
@SpringBootApplication
@MapperScan("com.spb.cc.spbcc.mapper")
public class SpbccApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpbccApplication.class);

	public static void main(String[] args) {
		logger.info("----------------------");
		SpringApplication.run(SpbccApplication.class, args);
		logger.info("----------------------");
	}
}
