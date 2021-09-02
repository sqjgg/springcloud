package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.jg.springcloud
 * @ClassName: OrderMain82
 * @Author: Levi
 * @CreateTime: 2021/8/26 0:24
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class,args);
    }
}
