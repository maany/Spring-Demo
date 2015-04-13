package com.maany.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * Created by OPSKMC on 4/12/15.
 */
public class Triangle implements InitializingBean, DisposableBean,BeanNameAware{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private List<Point> points;
    private String name;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        System.out.println("Constructor called");
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        System.out.println("setPointA() called for triangle " + name);
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public List getPoints() {
        return points;
    }

    public void setPoints(List points) {
        this.points = points;
    }

    public void draw(){
        System.out.println("Point A : x: " + pointA.getX() + " y: " + pointA.getY());
        System.out.println("Point B : x: " + pointB.getX() + " y: " + pointB.getY());
        System.out.println("Point C : x: " + pointC.getX() + " y: " + pointC.getY());
        System.out.println("************** Printing List**************");
        for(Point point:points)
            System.out.println("Point : x: " + point.getX() + " y: " + point.getY());
        System.out.println("**************List Complete***************");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set for triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(name + " Bean Destroyed");
    }

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    public void onInit(){
        System.out.println("My init method called for " + name);
    }
    public void onDestroy(){
        System.out.println("My destroy method called for " + name);
    }
}
