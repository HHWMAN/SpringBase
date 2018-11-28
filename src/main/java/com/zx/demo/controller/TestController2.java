package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
@RequestMapping("/test2")
public class TestController2 {

    protected final Logger logger = LogManager.getLogger(TestController2.class);

    @RequestMapping("/test")
    public String test() {
        logger.info("test");
        return "test";
    }

    @RequestMapping("/test/**")
    public String test_() {
        logger.info("test/**");
        return "test";
    }

    @RequestMapping("/test/{str}/*")
    public String testString() {
        logger.info("test/{str}/*");
        return "test";
    }

    @RequestMapping("/test/{str}/**")
    public String testString2() {
        logger.info("test/{str/**");
        return "test";
    }

    @RequestMapping("/test2")
    public String vuePage2() {
        logger.info("test2");
        return "test2";
    }




}
