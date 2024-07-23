package com.demo.SpringBootJSTLBootstrapJquery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJstlBootstrapJqueryApplication {
	
	private static final String USER_FILENAME = "user.txt";
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJstlBootstrapJqueryApplication.class, args);
	}
	
}
