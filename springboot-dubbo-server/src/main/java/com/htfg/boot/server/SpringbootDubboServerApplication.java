package com.htfg.boot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringbootDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServerApplication.class, args);
		//ConfigurableApplicationContext  run = SpringApplication.run(SpringbootDubboServerApplication.class, args);
	}
}
