package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: PaymentController
 * @Author: Levi
 * @CreateTime: 2021/8/29 18:25
 * @Description:
 */
@RestController
@RequestMapping("payment")
@DefaultProperties(defaultFallback = "defaultFallBack")
public class PaymentController {

    @Resource
    PaymentService service;


    @GetMapping("/success/{id}")
    public Object doSuccess(@PathVariable("id") Long id){
        String result = service.doSuccess(id);
        return new CommonResult(200,result);
    }

    @HystrixCommand(fallbackMethod = "fallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    @GetMapping("/faile/{id}")
    public Object doFaile(@PathVariable("id") Long id){
        int i = 1/0;
        String result = service.doFaile(id);
        return new CommonResult(200,result);
    }

    public CommonResult fallBack(Long id){
        return new CommonResult(500,"/(ㄒoㄒ)/~~服务器出问题了 message: " + id);
    }

    public String defaultFallBack(Exception e){
        return "/(ㄒoㄒ)/~~🆒 message: " + e.getMessage();
    }
}
