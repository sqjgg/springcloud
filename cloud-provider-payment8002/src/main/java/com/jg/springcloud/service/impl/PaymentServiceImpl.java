package com.jg.springcloud.service.impl;

import com.jg.springcloud.dao.PaymentDao;
import com.jg.springcloud.entities.Payment;
import com.jg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Package: com.jg.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: Levi
 * @CreateTime: 2021/8/24 12:05
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment selectOne(Long id) {
        return paymentDao.selectOne(id);
    }

    @Override
    public List<Payment> selectAllPayment() {
        return paymentDao.selectAllPayment();
    }
}
