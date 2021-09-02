package com.jg.springcloud.service.impl;

import com.jg.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Package: com.jg.springcloud.service.impl
 * @ClassName: PaymentHystrixFallBack
 * @Author: Levi
 * @CreateTime: 2021/9/1 20:15
 * @Description:
 */
@Component
public class PaymentHystrixFallBack implements PaymentHystrixService {
    @Override
    public Object doSuccess(Long id) {
        return "doSuccess服务超时了";
    }

    @Override
    public Object doFaile(Long id) {
        return "doFaile服务超时了";
    }
}
