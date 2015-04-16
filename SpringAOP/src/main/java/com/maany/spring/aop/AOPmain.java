package com.maany.spring.aop;

import com.maany.spring.aop.service.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by OPSKMC on 4/14/15.
 */
public class AOPmain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Shape shapeService = context.getBean("shape-service", Shape.class);
        shapeService.getCircle().setNameandReturn("New Circle Name");
    }
}
