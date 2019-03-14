package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;

import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.service.UserService;
import com.zx.demo.test.HelloWorld;
import com.zx.demo.test.HelloWorldImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import static java.lang.System.*;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class TestController {

    @Autowired
    HelloWorld helloWorld;

    protected final Logger logger = LogManager.getLogger(TestController.class);


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test() throws IOException {
        HelloWorld helloWorld1 = new HelloWorldImpl();
        return helloWorld1.printHelloWorld();
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    @ResponseBody
    public String test2() throws IOException {
        return helloWorld.printHelloWorld();
    }

    @RequestMapping(value = "/test3",method = RequestMethod.GET)
    @ResponseBody
    public String test3() throws IOException {
        return helloWorld.printString("aaaaaa");
    }

    @RequestMapping(value = "/test4",method = RequestMethod.GET)
    @ResponseBody
    public String test4(Model model) throws IOException {
        return helloWorld.printString2("BBBBBB");
    }

    @RequestMapping(value = "/test5",method = RequestMethod.GET)
    @ResponseBody
    public String test55(Model model) throws IOException {
        HelloWorld temp = new HelloWorldImpl();
        return temp.printString2("BBBBBB");
    }

    @RequestMapping(value = "/testResolver",method = RequestMethod.GET)
    @ResponseBody
    public String testResolver(String username) throws IOException {
        return username;
    }

    @ModelAttribute
    public void test5(Model model){
        model.addAttribute("aaaa","aaaa");
        System.out.println("test5");
    }

}
