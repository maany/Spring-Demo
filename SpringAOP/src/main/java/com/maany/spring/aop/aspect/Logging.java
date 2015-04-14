package com.maany.spring.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by OPSKMC on 4/14/15.
 */
@Aspect
public class Logging {
    /**
     * An aspect contains number of advices. standard AOP terminology.
     */
    @Before("execution(public * get*())")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get method called");
    }
}
