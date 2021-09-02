package com.jg.springcloud.service.impl;

import com.jg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @Package: com.jg.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: Levi
 * @CreateTime: 2021/8/29 18:22
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String doSuccess(Long id) {
        return "线程名：" + Thread.currentThread().getName() + "\t" + "id：" + id;
    }

    @Override
    public String doFaile(Long id) {
        Long time = 3000l;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程名：" + Thread.currentThread().getName() + "\t" + "id：" + id;
    }
}
