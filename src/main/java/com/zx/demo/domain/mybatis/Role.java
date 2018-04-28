package com.zx.demo.domain.mybatis;

public class Role {
    private String role_id;

    private String role_name;

    private String role_description;

    private String role_authority;

    private String isEnabled;

    private String isSys;

    private String rec_creator;

    private String rec_create_time;

    private String rec_revisor;

    private String rec_revisor_time;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public String getRole_authority() {
        return role_authority;
    }

    public void setRole_authority(String role_authority) {
        this.role_authority = role_authority;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
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