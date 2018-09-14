package com.jtech.microservice.springclouduser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

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
}
