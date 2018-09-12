package com.jtech.microservice.springcloudservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试代码。
 */
@RestController
public class TestController {

    /**
     * 测试使用。
     * @return 字符串。
     */
    @GetMapping(value = "getHelloWorld")
    public String getHelloWorld() {
        return "hello world";
    }
}
