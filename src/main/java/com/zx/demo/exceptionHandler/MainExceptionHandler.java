package com.zx.demo.exceptionHandler;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by ZX on 2017/11/16.
 */

@ControllerAdvice
public class MainExceptionHandler {

    protected final Logger logger = LogManager.getLogger(MainExceptionHandler.class);

   /* @ExceptionHandler(value = {Exception.class})
    public String test(Exception e){
        logger.info("输出异常");
        logger.error(e.toString());
        logger.info(e.getStackTrace().toString());
        return "redirect:error";
    }*/

}
