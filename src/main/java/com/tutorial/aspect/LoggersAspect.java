package com.tutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggersAspect {

    @Pointcut("execution (* *.show(..))")
    public void authentic() {
        System.out.println("Authenticated");
    }

    @Before("authentic()")
    public void beforeLogMessage(JoinPoint jp) {
        System.out.println("Before -- >");
    }

    @After("execution (* *.show(..))")
    public void afterLogMessage() {
        System.out.println("After");
    }

    @AfterReturning("execution (* *.show(..))")
    public void afterReturnLogMessage() {
        System.out.println("AfterReturning");
    }
}
