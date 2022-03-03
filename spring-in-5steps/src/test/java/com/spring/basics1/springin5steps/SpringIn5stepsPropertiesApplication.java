package com.spring.basics1.springin5steps;

import com.spring.basics1.springin5steps.basic.BinarySearch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5stepsPropertiesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5stepsPropertiesApplication.class);
		SomeExternalService someExternalService = context.getBean(SomeExternalService.class);
		System.out.println(someExternalService.returnServiceValue());
	}
}
