package com.maany.spring.aop.service;

/**
 * Created by OPSKMC on 4/14/15.
 */
public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //System.out.println("Circle setter called");
        this.name = name;
    }
    public String setNameandReturn(String name) {
        System.out.println("Circle setter called");
        this.name = name;
        //throw new RuntimeException();
        return name;
    }
}
