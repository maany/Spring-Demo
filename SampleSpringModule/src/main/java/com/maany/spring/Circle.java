package com.maany.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
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
public class Circle implements Shape {
    private Point center;
    @Autowired
    private MessageSource messageSource;
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println(messageSource.getMessage("circle.center",new Object[]{center.getX(),center.getY()},"No values found",null));
        //System.out.println("Center Point is (" + center.getX() + ", " + center.getY() + ")");
    }

    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }
}
