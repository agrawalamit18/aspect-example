package com.tutorial.bean;

import org.springframework.stereotype.Component;

@Component
public class Child implements Age{

    public void getAge() {
        System.out.println("Child age!!!");
    }
}
