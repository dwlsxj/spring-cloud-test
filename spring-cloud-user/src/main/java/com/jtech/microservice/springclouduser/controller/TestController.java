package com.jtech.microservice.springclouduser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用Service来获取内容。
     *
     * @return 返回hello world。
     */
    @GetMapping(value = "getHelloWorld")
    @HystrixCommand(fallbackMethod = "fallback")
    public String getHelloWorld() {
        logger.error("this is a error");
        return restTemplate.getForObject("http://springcloudservice/getHelloWorld", String.class);
    }

    /**
     * getHelloWorld的熔断机制。
     *
     * @return 熔断信息。
     */
    public String fallback() {
        return "fallbck";
    }

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile() {
        return this.profile;
    }
}
