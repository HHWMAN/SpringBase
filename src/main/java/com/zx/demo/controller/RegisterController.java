package com.zx.demo.controller;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;

import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.security.AppUserDetails;
import com.zx.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class RegisterController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    private UserDao UserDaoImpl;

    @Autowired
    private UserService userService;

   protected final Logger logger = LoggerFactory.getLogger(RegisterController.class);


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerUser(User user, @RequestParam("uploadPhoto") MultipartFile file, HttpServletRequest request) throws IOException {
        logger.info("进行注册");
        if(!file.isEmpty()) {
            //上传文件路径
            String path = "E:\\ideaWorkSpace\\download";
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + filename));
        } else {
            return "error";
        }

        //userService.addUser(user);
        return "login";
    }



}
