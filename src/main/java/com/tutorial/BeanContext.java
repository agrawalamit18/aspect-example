package com.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan (basePackages = "com.tutorial.*, com.tutorial.aspect")
@EnableAspectJAutoProxy

public class BeanContext {


}
