package com.maany.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by OPSKMC on 4/12/15.
 */
public class DrawingApplication {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();
        Triangle triangle = context.getBean("triangle",Triangle.class);
        Triangle triangle2 = context.getBean("triangle2",Triangle.class);

        triangle.draw();
        triangle2.draw();
    }

}
