package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;

import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.service.UserService;
import com.zx.demo.test.HelloWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class TestController {

    @Autowired
    HelloWorld helloWorld;

    protected final Logger logger = LogManager.getLogger(TestController.class);


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() throws IOException {
        return helloWorld.printHelloWorld();
    }



}
