package com.demo.whatsappapiDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo")
public class WhatsappapiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappapiDemoApplication.class, args);
	}

}
