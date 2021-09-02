package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: OrderController
 * @Author: Levi
 * @CreateTime: 2021/8/26 0:26
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    private final String URL = "http://consul-payment-provider";

    @Resource
    RestTemplate restTemplate;

    @GetMapping("payment")
    public Object get(){
        return restTemplate.getForObject(URL + "/payment/consul", CommonResult.class);
    }
}
