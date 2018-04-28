package com.zx.demo.domain.mybatis;

public class RoleAuthority {
    private String role_authority_id;

    private String role_id;

    private String rauthority_id;

    private String rec_creator;

    private String rec_create_time;

    private String rec_revisor;

    private String rec_revisor_time;

    public String getRole_authority_id() {
        return role_authority_id;
    }

    public void setRole_authority_id(String role_authority_id) {
        this.role_authority_id = role_authority_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRauthority_id() {
        return rauthority_id;
    }

    public void setRauthority_id(String rauthority_id) {
        this.rauthority_id = rauthority_id;
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