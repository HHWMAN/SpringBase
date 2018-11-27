package com.zx.demo.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloWorldAspect {

    @Before("execution(* com.zx.demo.test.HelloWorldImpl.printHelloWorld(..))")
    public void beforeHello(){
        System.out.println("前置");
    }

}
