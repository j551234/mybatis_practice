package com.example.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.practice.dao")
public class MybatistryApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(MybatistryApplication.class, args);
	}

}
