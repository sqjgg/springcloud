package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.jg.springcloud
 * @ClassName: PaymentMain8001
 * @Author: Levi
 * @CreateTime: 2021/8/24 9:56
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient//eureka服务端
@EnableDiscoveryClient//服务发现客户端
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
