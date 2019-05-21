package com.test.gradl;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class GradlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradlApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
