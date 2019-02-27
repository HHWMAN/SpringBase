package com.zx.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class MyExceptionHandler {
    protected final Logger logger = LogManager.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    public String errorHandler(Exception ex) {
        System.out.println(ex.toString());
        logger.info(ex.toString());
        return ex.toString();
    }

}
