package com.htfg.boot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.htfg.boot.client.dubbo.EmployeeConsumerService;

@SpringBootApplication
//@ImportResource(value = {"classpath:consumers.xml"})
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  run = SpringApplication.run(SpringbootDubboClientApplication.class, args);
		EmployeeConsumerService employeeService = run.getBean(EmployeeConsumerService.class);
		employeeService.printEmployee();
	}
}
