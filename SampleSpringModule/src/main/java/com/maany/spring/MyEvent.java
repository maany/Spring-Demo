package com.maany.spring;

import org.springframework.context.ApplicationEvent;

/**
 * Created by OPSKMC on 4/13/15.
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
