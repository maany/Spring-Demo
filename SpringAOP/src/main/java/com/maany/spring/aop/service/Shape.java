package com.maany.spring.aop.service;

import com.maany.spring.aop.loggable;

/**
 * Created by OPSKMC on 4/14/15.
 */
public class Shape {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
