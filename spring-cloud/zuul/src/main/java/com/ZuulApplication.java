package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
