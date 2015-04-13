package com.maany.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by OPSKMC on 4/13/15.
 */
public class MyBPP  implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException,NullPointerException {
        if(bean instanceof Triangle){
            System.out.println("Found Triangle in before lifecycle callbacks");
            System.out.println("is pointA null? " + (((Triangle)bean).getPointA()==null));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        if(bean instanceof Triangle){
            System.out.println("Found Triangle in after lifecycle callbacks life aftePropertiesSet or custom init-method");
            System.out.println("is pointA null? " + ((Triangle)bean).getPointA()==null);
        }
        return bean;
    }
}
