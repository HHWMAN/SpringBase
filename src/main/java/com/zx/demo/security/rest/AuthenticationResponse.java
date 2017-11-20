package com.zx.demo.security.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import static java.lang.String.valueOf;


public class AuthenticationResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String token;
    private int expire;
    private String userId;
    private String userType;
    private String cityId;
    private String username;

    public AuthenticationResponse(int userId, int id, String token, int expire) {
        this(valueOf(userId),id,token,expire);
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public AuthenticationResponse() {
        super();
    }

    /**
     * @param userId
     *            统一的用户id
     * @param id
     *            顾客、美容师、店主、平台用户的id
     * @param token
     * @param expire
     */
    public AuthenticationResponse(String userId, int id, String token, int expire) {
        this.setUserId(userId);
        this.setId(id);
        this.setToken(token);
        this.setExpire(expire);
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    @JsonProperty("uid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
