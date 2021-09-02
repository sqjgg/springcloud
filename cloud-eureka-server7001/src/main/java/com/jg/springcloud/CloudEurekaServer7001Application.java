package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//eureka服务注册中心
public class CloudEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
    }

}
