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
 * @CreateTime: 2021/8/25 20:01
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    RestTemplate template;

    private final String URL = "http://cloud-payment-provider";

    @GetMapping("payment")
    public Object get(){
        return template.getForObject(URL + "/payment/Zk", CommonResult.class);
    }
}
