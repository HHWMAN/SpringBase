package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;
import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.mybatis.UserMapper;

import com.zx.demo.domain.mybatis.User;
import com.zx.demo.security.AppUserDetails;
import com.zx.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Collection;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    private UserDao UserDaoImpl;

    @Autowired
    private UserService userService;

   protected final Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return "hello, world! This com from spring!";
    }


  /*  @PreAuthorize("hasAuthority('USER')")*/
    @GetMapping("/index")
    public String getIndex() {
        //int a = 1/0;
        logger.info("进行add");
       /* User user = new User();
        user.setUser_id("2");
        user.setUsername("zx2");
        user.setPassword("zx2");
        *//*UserDaoImpl.addUser(user);*//*
        userMapper.insert(user);*/
        logger.info("add over");
        return "index2";
    }


    @RequestMapping("/demo")
    public String getDemo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof AppUserDetails) {
            Collection<? extends GrantedAuthority> test = ((AppUserDetails)principal).getAuthorities();
            String authority="";
            for(int i=0;i<test.size();i++) {
               authority = ((GrantedAuthority) ((java.util.ArrayList) test).get(i)).getAuthority();
               logger.info(authority);
            }

        } else {
            String username = principal.toString();
        }



              logger.info("demo");
        // print internal state
       /* LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);*/
           logger.info("进行add");
       // userService.addUser();
          logger.info("add over");
        return "demo";
    }




    //正式使用方法
    @RequestMapping("/favicon.ico")
    public String getFavicon() {
        logger.info("设置网页图标");
        return "forward:/images/favicon.ico";
    }


    @RequestMapping("/login")
    public String getLogin(HttpServletRequest request) {
        logger.info("进行登录");
        /*HttpSession session= request.getSession();
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);*/
        return "login";
    }

    @GetMapping("/logout")
    public String getLogout() {
        logger.info("进行登出");
        return "login";
    }

    @RequestMapping("/error")
    public String getError() {
        logger.info("error");

        return "error";
    }

   /* @RequestMapping("/test")
    public ModelMap getError(ModelMap test) {
        logger.info("error");

        return test;
    }*/

    @RequestMapping("/test")
    public String vuePage() {
        logger.info("vue");
        return "test";
    }


    @RequestMapping("/test2")
    public String vuePage2() {
        logger.info("vue");
        return "shopIndex";
    }



}
