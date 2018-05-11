package com.zx.demo.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

public class DataGetPost {

    public static String getDataPost(String url, String data) {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(5000);


        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpHeaders httpHeaders = new HttpHeaders();
        //由于iplat-core包中依赖包没有更新到最新4.2.5，使用的是4.1.1，导致该变量没有找到，暂且注释掉
        //httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> httpEntity = new HttpEntity<String>(data,httpHeaders);
        return restTemplate.postForObject(url,httpEntity,String.class);
    }

    public static String getDataGet(String url){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(5000);
        RestTemplate restTemplate = new RestTemplate(factory);
        return restTemplate.getForObject(url, String.class);
    }
}
