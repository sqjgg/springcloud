package com.jg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package: com.jg.springcloud
 * @ClassName: OrdeFeign80
 * @Author: Levi
 * @CreateTime: 2021/8/29 16:09
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrdeFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrdeFeign80.class,args);
    }
}
