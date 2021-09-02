package com.jg.springcloud.service;

/**
 * @Package: com.jg.springcloud.service
 * @ClassName: PaymentService
 * @Author: Levi
 * @CreateTime: 2021/8/29 18:21
 * @Description:
 */
public interface PaymentService {

    String doSuccess(Long id);

    String doFaile(Long id);
}
