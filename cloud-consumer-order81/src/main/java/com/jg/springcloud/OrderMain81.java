package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.jg.springcloud
 * @ClassName: OrderMain81
 * @Author: Levi
 * @CreateTime: 2021/8/25 20:00
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class,args);
    }
}
