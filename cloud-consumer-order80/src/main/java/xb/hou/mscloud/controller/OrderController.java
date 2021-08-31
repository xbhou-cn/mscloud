package xb.hou.mscloud.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import xb.hou.mscloud.entities.Payment;
import xb.hou.mscloud.entities.R;

/**
 * @title: OrderController
 * @Author xbhou
 * @Date: 2021-08-31 22:21
 * @Version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
@Slf4j
public class OrderController {
    /**
     * RestTemplate提供多种便捷访问远程Http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模版工具类
     */
    private final RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://localhost:8001";

    @PostMapping("/create")
    public R create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, R.class);
    }

    @GetMapping("/get/{id}")
    public R create(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, R.class);
    }
}
