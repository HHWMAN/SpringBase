package com.zx.demo.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by ZX on 2017/11/14.
 */

public class TestInterceptor extends HandlerInterceptorAdapter {
    long startTime;
    long endTime;

    public TestInterceptor() {
        super();
        System.out.println("拦截器初始化");

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("经过测试拦截器preHandle");
        startTime= Calendar.getInstance().getTimeInMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("经过测试拦截器postHandle");
        super.postHandle(request, response, handler, modelAndView);

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("经过测试拦截器afterCompletion");
        endTime=Calendar.getInstance().getTimeInMillis();
        Long cost = endTime-startTime;
        System.out.println("花费时间："+cost);
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
