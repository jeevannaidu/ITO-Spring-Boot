package com.spring.basics1.springin5steps;
import com.spring.basics1.springin5steps.scope.XmlPersonDao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5stepsXmlApplication {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDao xmlpersonDao = context.getBean(XmlPersonDao.class);

			System.out.println(xmlpersonDao);
			System.out.println(xmlpersonDao.getXmlJdbcConnection());
		}
		
	}
}
