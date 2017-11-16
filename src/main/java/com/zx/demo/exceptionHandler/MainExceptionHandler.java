package com.zx.demo.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by ZX on 2017/11/16.
 */

@ControllerAdvice
public class MainExceptionHandler {

    protected final Logger logger = LoggerFactory.getLogger(MainExceptionHandler.class);

    @ExceptionHandler(value = {Exception.class})
    public String test(Exception e){
        logger.info("输出异常");
        logger.error(e.toString());
        return "redirect:error";
    }

}
