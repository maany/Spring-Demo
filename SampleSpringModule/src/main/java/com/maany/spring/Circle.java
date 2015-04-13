package com.maany.spring;

/**
 * Created by OPSKMC on 4/13/15.
 */
public class Circle implements Shape {
    private Point center;
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Center Point is (" + center.getX() + ", " + center.getY() + ")");
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
