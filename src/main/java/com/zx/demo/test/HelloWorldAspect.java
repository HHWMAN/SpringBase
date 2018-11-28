package com.zx.demo.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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

    @Before(value = "execution(* com.zx.demo.test.HelloWorldImpl.printString(java.lang.String)) && args(str)",argNames = "str")
    public void beforePrint(String str){
        System.out.println("参数是:"+str);
    }

    @Before(value = "execution(* com.zx.demo.test.HelloWorldImpl.printString2(java.lang.String))")
    public void beforePrintJP(JoinPoint jp){
        System.out.println("JP:"+jp);
        System.out.println(jp.getArgs());  //参数
        System.out.println(jp.getThis());
        System.out.println(jp.getTarget());
    }

    //该方法会报错，ProceedingJoinPoint仅支持在around 通知上
//    @Before(value = "execution(* com.zx.demo.test.HelloWorldImpl.printString2(java.lang.String))")
//    public void beforePrintJP(ProceedingJoinPoint jp){
//        System.out.println("JP:"+jp);
//    }
}
