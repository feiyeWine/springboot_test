package com.yin.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class UserInfo {
    private Integer id;

    private String name;

    private String password;

    @Override
    public String toString() {

        return "id:" + this.getId() + "name:" + this.getName() + "password:" + this.getPassword();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}