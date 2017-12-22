package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;
import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.mybatis.UserMapper;

import com.zx.demo.security.AppRoleAuthority;
import com.zx.demo.security.AppUserDetails;
import com.zx.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    private UserDao UserDaoImpl;

    @Autowired
    private UserService userService;

   protected final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/hello")
    public @ResponseBody
    String test() {
        return "hello, world! This com from spring!";
    }


    @GetMapping("/login")
    public String getLogin() {
        logger.info("进行登录");
        return "login";
    }

    @GetMapping("/logout")
    public String getLogout() {
        logger.info("进行登出");
        return "login";
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
        return "index";
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

    @RequestMapping("/error")
    public String getError() {
        logger.info("error");

        return "error";
    }
}
