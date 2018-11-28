package com.zx.demo.test;

import com.zx.demo.domain.mybatis.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConnfig {

    @Bean
    @Profile("test")
    public User getUser(){
        return new User();
    }

    @Bean
    @Profile("dev")
    public User getUser2(){
        return new User();
    }
}
