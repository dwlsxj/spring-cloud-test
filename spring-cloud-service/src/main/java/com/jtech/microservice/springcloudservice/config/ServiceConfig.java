package com.jtech.microservice.springcloudservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 基础配置信息。
 */
@Configuration
public class ServiceConfig {

    /**
     * 获取RestTemplate对象。
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
