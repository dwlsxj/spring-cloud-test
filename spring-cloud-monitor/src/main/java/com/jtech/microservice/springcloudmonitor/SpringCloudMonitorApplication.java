package com.jtech.microservice.springcloudmonitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
@EnableAdminServer
public class SpringCloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMonitorApplication.class, args);
    }
}
