package com.jg.springcloud.service;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.entities.Payment;
import com.jg.springcloud.service.impl.PaymentHystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package: com.jg.springcloud.service
 * @ClassName: PaymentFeignService
 * @Author: Levi
 * @CreateTime: 2021/8/29 16:10
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-PROVIDER")
public interface PaymentFeignService {

    @GetMapping("payment/{id}")
    public Object selectOne(@PathVariable("id") Long id);
}
