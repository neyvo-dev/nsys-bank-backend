package com.neyvo.nsysbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class NsysbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsysbankApplication.class, args);
	}

}
