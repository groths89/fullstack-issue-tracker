package com.rothstein.issuestracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class IssuesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuesTrackerApplication.class, args);
	}

}
