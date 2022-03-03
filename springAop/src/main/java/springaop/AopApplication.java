package springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springaop.bussiness.Bussiness1;
import springaop.bussiness.Bussiness2;

@SpringBootApplication
public class AopApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
//	
	@Autowired
	Bussiness1 bussiness1;
	
	@Autowired
	Bussiness2 bussiness2;
	
	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(bussiness1.calculateSomething());
		logger.info(bussiness2.calculateSomething());
	}

}
