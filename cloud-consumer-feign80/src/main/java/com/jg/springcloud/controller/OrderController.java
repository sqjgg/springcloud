package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.service.PaymentFeignService;
import com.jg.springcloud.service.PaymentHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: OrderController
 * @Author: Levi
 * @CreateTime: 2021/8/29 16:12
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    PaymentFeignService service;

    @Resource
    PaymentHystrixService hystrixService;

    @GetMapping("{id}")
    public Object get(@PathVariable("id") Long id){
        return service.selectOne(id);
    }


    @GetMapping("/success/{id}")
    public Object doSuccess(@PathVariable("id") Long id){
        return hystrixService.doSuccess(id);
    }

    @GetMapping("/faile/{id}")
    public Object doFaile(@PathVariable("id") Long id){
        return hystrixService.doFaile(id);
    }
}
