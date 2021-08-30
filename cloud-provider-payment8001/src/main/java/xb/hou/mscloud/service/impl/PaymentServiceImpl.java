package xb.hou.mscloud.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xb.hou.mscloud.entities.Payment;
import xb.hou.mscloud.mapper.PaymentMapper;
import xb.hou.mscloud.service.PaymentService;

/**
 * @title: PaymentServiceImpl
 * @Author xbhou
 * @Date: 2021-08-31 0:06
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentMapper paymentMapper;

    @Override
    public int add(Payment payment) {
        return paymentMapper.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
