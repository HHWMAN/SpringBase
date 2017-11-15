package com.zx.demo.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.zx.demo.dao.JdbcDataDAO;
import com.zx.demo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class IndexController {

    @Autowired
    private JdbcDataDAO JdbcDataDAOImpl;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public @ResponseBody
    String test() {
        return "hello, world! This com from spring!";
    }

    @GetMapping("/")
    public String firstPage() {
        logger.info("/");
        return "index";
    }


    @GetMapping("/index")
    public String getIndex() {
        logger.info("进行add");
        User user = new User();
        JdbcDataDAOImpl.addUser(user);
        logger.info("add over");
        return "index";
    }


    @RequestMapping("/demo")
    public String getDemo() {
        logger.info("demo");
        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        return "demo";
    }

}
