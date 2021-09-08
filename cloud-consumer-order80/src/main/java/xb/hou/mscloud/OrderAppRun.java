package xb.hou.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title: OrderAppRun
 * @Author xbhou
 * @Date: 2021-08-31 22:15
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderAppRun {
    public static void main(String[] args) {
        SpringApplication.run(OrderAppRun.class, args);
    }
}
