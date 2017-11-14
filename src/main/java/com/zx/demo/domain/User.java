package com.zx.demo.domain;

/**
 * Created by ZX on 2017/11/14.
 */
public class User {
    private  String id;
    private  String username;
    private  String passowrd;
    private  String sex;
    private  String age;
    private  String rec_creator;
    private  String rec_create_time;
    private String rec_revisor;
    private String rec_revisor_time;

    public User() {
    }

    public User(String id, String username, String passowrd, String sex, String age, String rec_creator, String rec_create_time, String rec_revisor, String rec_revisor_time) {
        this.id = id;
        this.username = username;
        this.passowrd = passowrd;
        this.sex = sex;
        this.age = age;
        this.rec_creator = rec_creator;
        this.rec_create_time = rec_create_time;
        this.rec_revisor = rec_revisor;
        this.rec_revisor_time = rec_revisor_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
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
