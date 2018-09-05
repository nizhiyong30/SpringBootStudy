package com.example.springboot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by nizy on 2018/9/4.
 */
@Component
@Aspect
public class AOP {

    Logger logger = LoggerFactory.getLogger("SpringBootTest");

    @Pointcut("execution(* com.example.springboot.service..*.*(..))")
    public void pointCut(){

    }
    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        logger.info("AOP After Advice...");
        System.out.println("AOP After Advice...");
    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("AOP before Advice...");
        System.out.println("AOP before Advice...");
    }
}
