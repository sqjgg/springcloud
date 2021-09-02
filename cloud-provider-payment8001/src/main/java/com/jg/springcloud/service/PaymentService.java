package com.jg.springcloud.service;

import com.jg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: com.jg.springcloud.service
 * @ClassName: PaymentService
 * @Author: Levi
 * @CreateTime: 2021/8/24 12:04
 * @Description:
 */
public interface PaymentService {

    int addPayment(Payment payment);

    Payment selectOne(@Param("id") Long id);

    List<Payment> selectAllPayment();
}
