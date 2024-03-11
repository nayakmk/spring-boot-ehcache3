package com.example.ehcache.ehcacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.example.ehcache")
public class EhcacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheExampleApplication.class, args);
	}

}