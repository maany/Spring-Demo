package com.maany.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by OPSKMC on 4/14/15.
 */
//@Aspect
public class Logging {
    /**
     * An aspect contains number of advices. standard AOP terminology.
     */
  //  @Before("allCircleGetters() && allCircle()" ) //logical operations
    public void LoggingAdvice(){
        System.out.println("Advice run. Get method called");
    }
  //  @Before("allGetters()" )
    public void LoggingAdvice2(JoinPoint joinPoint){

        System.out.println(joinPoint.toString());
    }
  //  @Before("allCircle()")
    public void logStringSetters(JoinPoint joinPoint){
       // System.out.println("Name is " + name);
    }
    @Pointcut("execution(public * get*())")
    public void allGetters(){} // dummy method holding pointcut expression
    @Pointcut(value = "execution(*  com.maany.spring.aop.service.Circle.*(..))")
    public void allCircle(){}
    @Pointcut("within(com.maany.spring.aop.service.Circle)")
    public void allCircleGetters(){}
    @Pointcut("within(com.maany.spring.aop.service..*)") // all packages and subpackages
    public void allAOPGetters(){}

   // @After("args(name)") // IMPORTANT, First argument is to be JointPoint, followed by arguments of the method.
    public void stringSetters(JoinPoint joinPoint,String name){
        System.out.println("Name setter was called for " + name);
    }
   // @AfterReturning(pointcut = "args(name)", returning = "returnValue")
    public void successReturns(String name,String returnValue){
        System.out.println("Earlier value was : " + name + " and now it is : " + returnValue);
    }
   // @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionReturns(String name,Exception ex){
        System.out.println("An exception has been thrown : " + ex);
    }

    //@Around("args(name)")
    //@Around("@annotation(com.maany.spring.aop.loggable) && args(name)") //Custom Annotations
    @Around("allGetters() && args(name)")
    public Object aroundSetters(ProceedingJoinPoint proceedingJoinPoint,String name){
        Object returnValue = null;
        try {
            /* Do argument validations*/
            System.out.println("Before method");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After Returning");
            /* Do return value validations*/
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("After Throwing");
        }
        return returnValue;
    }



}
