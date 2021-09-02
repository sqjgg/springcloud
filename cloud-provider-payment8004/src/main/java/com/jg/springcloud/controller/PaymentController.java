package com.jg.springcloud.controller;

import com.jg.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Package: com.jg.springcloud.controller
 * @ClassName: PaymentController
 * @Author: Levi
 * @CreateTime: 2021/8/25 19:38
 * @Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String prot;

    @GetMapping("payment/Zk")
    public Object discoveryZk(){
        return new CommonResult<>(200,"访问成功,工作端口: " + prot + UUID.randomUUID().toString());
    }
}
