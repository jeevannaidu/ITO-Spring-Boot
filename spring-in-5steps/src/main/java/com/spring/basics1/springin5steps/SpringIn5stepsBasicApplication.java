package com.spring.basics1.springin5steps;

import com.spring.basics1.springin5steps.basic.BinarySearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5stepsBasicApplication {
//	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5stepsApplication.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5stepsBasicApplication.class);
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = context.getBean(BinarySearch.class);

		int result = binarySearch.search(new int[]{1,2,3,4},1);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

	}
}
