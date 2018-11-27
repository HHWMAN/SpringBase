package com.zx.demo.test;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl implements HelloWorld {
    public String printHelloWorld() {
        return "(HelloWorldImpl)-hello world";
    }
}
