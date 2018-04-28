package com.zx.demo.domain.mybatis;

public class Authority {
    private String authority_id;

    private String authority_sign;

    private String authority_name;

    private String authority_description;

    private String authority_remind;

    private String isEnabled;

    private String isSys;

    private String rec_creator;

    private String rec_create_time;

    private String rec_revisor;

    private String rec_revisor_time;

    public String getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(String authority_id) {
        this.authority_id = authority_id;
    }

    public String getAuthority_sign() {
        return authority_sign;
    }

    public void setAuthority_sign(String authority_sign) {
        this.authority_sign = authority_sign;
    }

    public String getAuthority_name() {
        return authority_name;
    }

    public void setAuthority_name(String authority_name) {
        this.authority_name = authority_name;
    }

    public String getAuthority_description() {
        return authority_description;
    }

    public void setAuthority_description(String authority_description) {
        this.authority_description = authority_description;
    }

    public String getAuthority_remind() {
        return authority_remind;
    }

    public void setAuthority_remind(String authority_remind) {
        this.authority_remind = authority_remind;
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