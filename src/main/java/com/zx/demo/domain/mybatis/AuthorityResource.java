package com.zx.demo.domain.mybatis;

public class AuthorityResource {
    private String authority_resource_id;

    private String authority_id;

    private String resource_id;

    private String rec_creator;

    private String rec_create_time;

    private String rec_revisor;

    private String rec_revisor_time;

    public String getAuthority_resource_id() {
        return authority_resource_id;
    }

    public void setAuthority_resource_id(String authority_resource_id) {
        this.authority_resource_id = authority_resource_id;
    }

    public String getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(String authority_id) {
        this.authority_id = authority_id;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
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