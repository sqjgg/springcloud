package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.jg.springcloud
 * @ClassName: HystrixPayment8001
 * @Author: Levi
 * @CreateTime: 2021/8/29 18:20
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8001.class,args);
    }
}
