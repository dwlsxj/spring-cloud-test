package com.jtech.mircroservice.springcloudsluethzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class SpringCloudSluethZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSluethZipkinApplication.class, args);
    }
}
