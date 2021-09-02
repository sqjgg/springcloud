package com.jg.springcloud.dao;

import com.jg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: com.jg.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: Levi
 * @CreateTime: 2021/8/24 11:54
 * @Description:
 */
@Mapper
public interface PaymentDao {

    int addPayment(Payment payment);

    Payment selectOne(@Param("id") Long id);

    List<Payment> selectAllPayment();

}
