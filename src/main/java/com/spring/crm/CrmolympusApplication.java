package com.spring.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.spring.crm")
@EnableJpaRepositories(basePackages = "com.spring.crm.repo")
public class CrmolympusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmolympusApplication.class, args);
	}

}
