package xb.hou.mscloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xb.hou.mscloud.entities.Payment;

/**
 * @title: PaymentDao
 * @Author xbhou
 * @Date: 2021-08-30 23:52
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
