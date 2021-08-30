package xb.hou.mscloud.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import xb.hou.mscloud.entities.Payment;
import xb.hou.mscloud.entities.R;
import xb.hou.mscloud.service.PaymentService;

/**
 * @title: PaymentController
 * @Author xbhou
 * @Date: 2021-08-31 0:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/payment")
@Slf4j
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/add")
    public R add(@RequestBody Payment payment) {
        int add = paymentService.add(payment);
        if (add > 0) {
            return new R(200, "插入数据库成功！", add);
        }
        return new R(400, "插入数据库失败！");
    }

    @GetMapping("/get/{id}")
    public R add(@PathVariable Long id) {
        return new R(200, "", paymentService.getPaymentById(id));
    }
}
