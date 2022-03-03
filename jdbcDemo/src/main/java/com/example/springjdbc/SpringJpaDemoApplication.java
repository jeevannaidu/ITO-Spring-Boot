package com.example.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjdbc.entity.Person;
import com.example.springjdbc.jpa.PersonJpaRepository;

//@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository jpaRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("insert 1001-> {}"+ jpaRepository.update(
				new Person("Jeevan","Naidu",new Date())));
//		logger.info("Find By id-> {1}"+ jpaRepository.findByid(1));

//		jpaRepository.deleteById(1);
		
		logger.info("\nAll person"+jpaRepository.findAll());	
		
	}

}
