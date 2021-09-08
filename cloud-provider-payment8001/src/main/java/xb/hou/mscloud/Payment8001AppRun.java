package xb.hou.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title: Payment8001AppRun
 * @Author xbhou
 * @Date: 2021-08-30 23:07
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8001AppRun {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001AppRun.class, args);
    }
}
