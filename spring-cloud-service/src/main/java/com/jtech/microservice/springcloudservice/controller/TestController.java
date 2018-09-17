package com.jtech.microservice.springcloudservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试代码。
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 测试使用。
     *
     * @return 字符串。
     */
    @GetMapping(value = "getHelloWorld")
    public String getHelloWorld() {
        System.out.println("调用Service服务");
        logger.debug("test");
        return "hello world";
    }
}
