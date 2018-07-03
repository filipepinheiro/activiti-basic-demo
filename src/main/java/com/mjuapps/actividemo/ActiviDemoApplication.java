package com.mjuapps.actividemo;

import com.mjuapps.actividemo.service.MyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActiviDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiviDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final MyService myService) {

		return new CommandLineRunner() {
			public void run(String... strings) throws Exception {
				myService.createPersons();
			}
		};

	}
}
