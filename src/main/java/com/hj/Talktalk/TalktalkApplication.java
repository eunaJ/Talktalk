package com.hj.Talktalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // spring.security 깔았다가.. 나중에 exclude 없앨 예정
//@ComponentScan(basePackages = "com.hj.Talktalk.service") // UserServiceTest 시 사용
public class TalktalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalktalkApplication.class, args);
	}

}
