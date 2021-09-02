package com.jg.springcloud;

import com.jg.myrule.Myrule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Package: com.jg.springcloud
 * @ClassName: OrderMain80
 * @Author: Levi
 * @CreateTime: 2021/8/24 16:35
 * @Description:
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "CLOUD-PAYMENT-PROVIDER",configuration = Myrule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
