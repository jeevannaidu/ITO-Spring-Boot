package com.spring.basics1.springin5steps;

import com.spring.basics1.springin5steps.cdi.SomeCdiBusiness;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5stepsCdiApplication {
//	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5stepsApplication.class);
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(SpringIn5stepsCdiApplication.class)) {
			SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);

			System.out.println(someCdiBusiness);

		}
	}
}
