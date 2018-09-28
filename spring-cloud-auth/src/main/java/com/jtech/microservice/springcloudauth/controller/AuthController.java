package com.jtech.microservice.springcloudauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    /**
     * 获取token
     * @return
     */
    @GetMapping(value = "/login")
    public String getAuthToken() {
        return "111";
    }
}
