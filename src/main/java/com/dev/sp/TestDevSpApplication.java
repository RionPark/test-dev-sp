package com.dev.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dev.sp.mapper")
public class TestDevSpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDevSpApplication.class, args);
	}

}
