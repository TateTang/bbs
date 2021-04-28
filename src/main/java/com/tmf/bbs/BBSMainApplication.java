package com.tmf.bbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tmf.bbs")
public class BBSMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(BBSMainApplication.class, args);
	}
}
