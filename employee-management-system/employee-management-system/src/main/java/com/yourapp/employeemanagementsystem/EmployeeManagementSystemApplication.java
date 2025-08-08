package com.yourapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to bootstrap the Spring Boot application.
 * The @SpringBootApplication annotation enables auto-configuration,
 * component scanning, and defines this as a configuration class.
 */
@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		// This method starts the embedded Tomcat server and runs the application.
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}