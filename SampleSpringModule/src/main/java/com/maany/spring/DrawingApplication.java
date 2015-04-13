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
       // Shape triangle = context.getBean("triangle",Shape.class);
       // Shape triangle2 = context.getBean("triangle2",Shape.class);
        Shape shape = context.getBean("circle",Shape.class);
       // triangle.draw();
       // triangle2.draw();
        shape.draw();
        System.out.println("******************");
        System.out.println(context.getMessage("main.greeting",null,"default message",null));
    }

}
