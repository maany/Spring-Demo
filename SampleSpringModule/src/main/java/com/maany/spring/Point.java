package com.maany.spring;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by OPSKMC on 4/12/15.
 */
public class Point implements BeanNameAware{
    private int x;
    private int y;
    private String name;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void onInit(){
        System.out.println("My init called for " + name);
    }

    public void onDestroy(){
        System.out.println("My destroy called " + name);
    }
    @Override
    public void setBeanName(String s) {
        this.name = s;
    }
}
