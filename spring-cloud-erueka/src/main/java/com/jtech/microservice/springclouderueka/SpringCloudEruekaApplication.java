package com.jtech.microservice.springclouderueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务段。
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEruekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEruekaApplication.class, args);
    }
}
