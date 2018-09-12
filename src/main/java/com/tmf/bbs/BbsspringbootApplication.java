package com.tmf.bbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.tmf.bbs")
@ComponentScan("com.tmf.bbs")
public class BbsspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbsspringbootApplication.class, args);
	}
}
