package com.zx.demo.domain.mybatis;

public class User {
    private String user_id;

    private String username;

    private String password;

    private String sex;

    private String age;

    private String email;

    private String isExpired;

    private String isEnabled;

    private String isLocked;

    private String isCredentialsExpired;

    private String rec_creator;

    private String rec_create_time;

    private String rec_revisor;

    private String rec_revisor_time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getIsCredentialsExpired() {
        return isCredentialsExpired;
    }

    public void setIsCredentialsExpired(String isCredentialsExpired) {
        this.isCredentialsExpired = isCredentialsExpired;
    }

    public String getRec_creator() {
        return rec_creator;
    }

    public void setRec_creator(String rec_creator) {
        this.rec_creator = rec_creator;
    }

    public String getRec_create_time() {
        return rec_create_time;
    }

    public void setRec_create_time(String rec_create_time) {
        this.rec_create_time = rec_create_time;
    }

    public String getRec_revisor() {
        return rec_revisor;
    }

    public void setRec_revisor(String rec_revisor) {
        this.rec_revisor = rec_revisor;
    }

    public String getRec_revisor_time() {
        return rec_revisor_time;
    }

    public void setRec_revisor_time(String rec_revisor_time) {
        this.rec_revisor_time = rec_revisor_time;
    }
}