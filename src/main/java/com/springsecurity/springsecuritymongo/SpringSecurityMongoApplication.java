package com.springsecurity.springsecuritymongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.springsecurity.springsecuritymongo.mongo"})
public class SpringSecurityMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMongoApplication.class, args);
	}

}
