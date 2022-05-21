package com.tutorial.bean;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (scopeName = "singleton")
public class Parent implements Age, BeanNameAware {

    public void getAge() {
        System.out.println("Parent age!!!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean is initialized and name set.");
    }
}