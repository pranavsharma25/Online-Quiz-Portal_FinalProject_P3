package com.springboot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.springboot")
@EntityScan("com.springboot.entity")
@EnableJpaRepositories("com.springboot.repository")
public class OnlineQuizPortalUsingRestAPIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizPortalUsingRestAPIsApplication.class, args);
	}
}
