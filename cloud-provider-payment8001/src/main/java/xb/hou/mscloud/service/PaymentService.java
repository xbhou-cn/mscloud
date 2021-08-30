package xb.hou.mscloud.service;

import org.apache.ibatis.annotations.Param;
import xb.hou.mscloud.entities.Payment;

/**
 * @title: PaymentService
 * @Author xbhou
 * @Date: 2021-08-31 0:05
 * @Version 1.0
 */
public interface PaymentService {
    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
