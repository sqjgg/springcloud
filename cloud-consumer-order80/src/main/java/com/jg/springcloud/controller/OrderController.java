package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.entities.Payment;

import com.jg.springcloud.lb.LB;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: OrderController
 * @Author: Levi
 * @CreateTime: 2021/8/24 16:47
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    DiscoveryClient client;

    @Resource
    LB loadBalance;

    //private final String URL = "http://localhost:8001/payment";
    private final String URL = "http://CLOUD-PAYMENT-PROVIDER";

    @PostMapping("payment")
    public Object addPayment(@RequestBody Payment payment){
        CommonResult result = restTemplate.postForObject(URL + "/payment", payment, CommonResult.class);
        return result;
    }

    @GetMapping("payment/{id}")
    public Object selectOne(@PathVariable("id") Long id){
        CommonResult result = restTemplate.getForObject(URL + "/payment/" + id, CommonResult.class);
        return result;
    }

    @GetMapping("lb")
    public Object lb(){
        List<ServiceInstance> services = client.getInstances("CLOUD-PAYMENT-PROVIDER");
        ServiceInstance instance = loadBalance.instance(services);
        URI uri = instance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb",String.class);
    }
}
