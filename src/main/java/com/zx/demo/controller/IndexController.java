package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;
import com.zx.demo.dao.UserDao;
import com.zx.demo.domain.User;
import com.zx.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ZX on 2017/11/13.
 */
@Controller
public class IndexController {

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

    @GetMapping("/")
    public String firstPage() {
        logger.info("/");
        return "index";
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


    @GetMapping("/index")
    public String getIndex() {
        //int a = 1/0;
        logger.info("进行add");
        User user = new User();
        user.setId("1");
        user.setUsername("zx");
        user.setPassowrd("zx");
        UserDaoImpl.addUser(user);
        logger.info("add over");
        return "index";
    }


    @RequestMapping("/demo")
    public String getDemo() {
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
