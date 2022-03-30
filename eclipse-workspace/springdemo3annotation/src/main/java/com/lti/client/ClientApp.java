package com.lti.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.beans.Employee;




public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.config.xml");
		
			Employee  e= (Employee) context.getBean("e1");
			System.out.println(e);
	}

}