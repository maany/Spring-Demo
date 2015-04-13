package com.maany.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by OPSKMC on 4/13/15.
 */
@Controller
public class Circle implements Shape,ApplicationContextAware {
    private Point center;
    private ApplicationContext context;
    @Autowired
    private MessageSource messageSource;
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println(messageSource.getMessage("circle.center",new Object[]{center.getX(),center.getY()},"No values found",null));
        //System.out.println("Center Point is (" + center.getX() + ", " + center.getY() + ")");
        ApplicationEvent myEvent = new MyEvent(this);
        context.publishEvent(myEvent);
    }

    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
