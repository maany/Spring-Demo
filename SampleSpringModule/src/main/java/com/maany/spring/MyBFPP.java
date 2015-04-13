package com.maany.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by OPSKMC on 4/13/15.
 */
public class MyBFPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        boolean value = configurableListableBeanFactory.containsSingleton("triangle");
        Triangle triangle = (Triangle) configurableListableBeanFactory.getBean("triangle");
        System.out.println("Bean Factory Post Processor contains SIngleton triangle?" + value);
     //   System.out.println("Also is triangle null? " + triangle );
    }
}
