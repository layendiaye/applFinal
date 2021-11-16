package com.m2i.appliTpFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * NB: @SpringBootApplication est un équivalent de @Configuration
 * + @EnableAutoConfiguration + @ComponentScan/current package
 */
@SpringBootApplication
public class AppliTpFinal extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AppliTpFinal.class, args);
		System.out.println("http://localhost:8090/appliTpFinal");
	}
}