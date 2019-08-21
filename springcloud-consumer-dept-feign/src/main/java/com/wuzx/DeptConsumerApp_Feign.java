package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: springcloud-parent->DeptConsumerApp
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 17:16
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wuzx"})
public class DeptConsumerApp_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp_Feign.class, args);
    }
}
