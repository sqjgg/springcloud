package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.entities.Payment;
import com.jg.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: PaymentController
 * @Author: Levi
 * @CreateTime: 2021/8/24 12:12
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Resource
    PaymentService service;

    @Resource
    DiscoveryClient discoveryClient;

    /**
     * 查询一条流水信息
     * @param id 流水号id
     * @return
     */
    @GetMapping("payment/{id}")
    public Object selectOne(@PathVariable("id") Long id){
        try {
            Payment payment = service.selectOne(id);
            return new CommonResult<Payment>(200,"获取成功,工作端口: " + port,payment);
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult<Payment>(500,e.getMessage());
        }
    }

    /**
     * 插入一条流水号信息
     * @param payment
     * @return
     */
    @PostMapping("payment")
    public Object addPayment(@RequestBody Payment payment){
        try {
            service.addPayment(payment);
            return new CommonResult<Payment>(200,"插入成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult<Payment>(500,e.getMessage());
        }
    }

    @GetMapping("discovery")
    public Object discovery(){
        //获取所有微服务名称
        List<String> services = discoveryClient.getServices();
        for (String name : services) {
            System.out.println("*****微服务名称: " + name);
            List<ServiceInstance> instances = discoveryClient.getInstances(name);
            for (ServiceInstance instance : instances) {
                log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
            }
        }
        return discoveryClient;
    }


}
