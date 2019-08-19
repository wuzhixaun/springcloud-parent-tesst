package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud-parent->DeptConsumerApp
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 17:16
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class, args);
    }
}