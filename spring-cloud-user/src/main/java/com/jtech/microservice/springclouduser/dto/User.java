package com.jtech.microservice.springclouduser.dto;

/**
 * 用户类。
 */
public class User {
    /**
     * 自增编号。
     */
    private Integer id;
    /**
     * 姓名。
     */
    private String name;
    /**
     * 密码。
     */
    private String password;


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
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
