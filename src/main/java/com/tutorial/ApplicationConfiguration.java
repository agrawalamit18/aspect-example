package com.tutorial;

import com.tutorial.component.PrintName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfiguration {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext (BeanContext.class);
        PrintName name = context.getBean(PrintName.class);
        name.show("Ted");
    }
}
