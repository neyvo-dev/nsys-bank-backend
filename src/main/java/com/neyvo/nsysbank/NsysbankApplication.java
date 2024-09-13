package com.neyvo.nsysbank;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
@EnableMongoRepositories
public class NsysbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsysbankApplication.class, args);
	}

	@Bean
	NewTopic notificationTopic() {
		return TopicBuilder.name("conta-notification")
				.build();
	}

}
