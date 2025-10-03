package com.ziedscavern.numb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class NumbApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumbApplication.class, args);
	}

}
