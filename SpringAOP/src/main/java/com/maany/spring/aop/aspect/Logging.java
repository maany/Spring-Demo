package com.maany.spring.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by OPSKMC on 4/14/15.
 */
@Aspect
public class Logging {
    /**
     * An aspect contains number of advices. standard AOP terminology.
     */
    @Before("allCircleGetters() && allCircle()" ) //logical operations 
    public void LoggingAdvice(){
        System.out.println("Advice run. Get method called");
    }
  //  @Before("allGetters()" )
    public void LoggingAdvice2(){
        System.out.println("yoyo Advice run. Get method called");
    }
    @Pointcut("execution(public * get*())")
    public void allGetters(){} // dummy method holding pointcut expression
    @Pointcut(value = "execution(*  com.maany.spring.aop.service.Circle.*(..))")
    public void allCircle(){}
    @Pointcut("within(com.maany.spring.aop.service.Circle)")
    public void allCircleGetters(){}
    @Pointcut("within(com.maany.spring.aop.service..*)") // all packages and subpackages
    public void allAOPGetters(){}

    public void
}
