package com.lti.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmployeeConfig {

	@Bean
	public Employee HelloWorld() {
		return new Employee();
	}
}
