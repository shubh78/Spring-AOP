package com.csipl.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;
@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages={"com.csipl.aop.*" })
public class SpringAopApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

}
