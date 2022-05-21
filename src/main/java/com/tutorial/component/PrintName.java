package com.tutorial.component;

import org.springframework.stereotype.Component;

@Component
public class PrintName {

    public void show(String name) {
        System.out.println(" Name is " +name);
    }
}
