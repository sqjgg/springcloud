package com.jg.springcloud.service;

import com.jg.springcloud.entities.CommonResult;
import com.jg.springcloud.service.impl.PaymentHystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package: com.jg.springcloud.service
 * @ClassName: PaymentHystrixService
 * @Author: Levi
 * @CreateTime: 2021/8/29 18:33
 * @Description:
 */
@Component
@FeignClient(value = "HYSTRIX-PAYMENT-PROVIDER",fallback = PaymentHystrixFallBack.class)
public interface PaymentHystrixService {

    @GetMapping("payment/success/{id}")
    public Object doSuccess(@PathVariable("id") Long id);

    @GetMapping("payment/faile/{id}")
    public Object doFaile(@PathVariable("id") Long id);
}
