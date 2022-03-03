package com.example.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjdbc.entity.Person;
import com.example.springjdbc.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users-> {}"+dao.findAll());
		logger.info("User 1002-> {}"+dao.findById(1002));
		logger.info("User 1002-> {}"+dao.deleteById(1001));
		logger.info("insert 1001-> {}"+dao.insertPerson(
				new Person(1001,"Jeevan","Naidu",new Date())));
		logger.info("Update 1002-> {}"+dao.updatePerson(
				new Person(1002,"Dheeraj","Mantripragada",new Date())));
	}

}
