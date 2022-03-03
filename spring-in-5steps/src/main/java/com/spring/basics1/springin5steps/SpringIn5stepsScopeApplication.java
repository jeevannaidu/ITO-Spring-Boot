package com.spring.basics1.springin5steps;

import com.spring.basics1.springin5steps.scope.PersonDao;
import com.spring.basics1.springin5steps.scope.XmlPersonDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5stepsScopeApplication {
//	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5stepsApplication.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5stepsScopeApplication.class);
		PersonDao personDao = context.getBean(PersonDao.class);

		System.out.println(personDao);

		
	}
}
