package springaop.aspect;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//AOP
//Configuration
@Aspect
@Configuration
public class BeforeAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Before("springaop.aspect.CommonJoinConfig.buissiness()")
//	public void before(JoinPoint joinpoint ) {
//		logger.info("Intercespted method call {}",joinpoint);
//	}
//	
//	@AfterReturning(value="execution (* springaop.bussiness.*.*(..))",
//			returning="result")
//	public void after(JoinPoint joinpoint, Object result) {
//		logger.info("{} returning with value {} ",joinpoint, result);
//	}
//	
//	@AfterThrowing(value="execution (* springaop.bussiness.*.*(..))",
//			throwing="exception")
//	public void afterThrowing(JoinPoint joinpoint, Exception exception) {
//		logger.info("{} returning with value {} ",joinpoint, exception);
//	}
//	
//	@After(value="execution (* springaop.bussiness.*.*(..))")
//	public void after(JoinPoint joinpoint) {
//		logger.info("{} returning with value {} ",joinpoint);
//	}
	
	@Around(value="springaop.aspect.CommonJoinConfig.buissiness()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long endTime = System.currentTimeMillis() - startTime;
		logger.info("{} returning with value {} ",joinpoint, endTime);
	}
	
}
