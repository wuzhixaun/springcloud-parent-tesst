package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-parent->EurekaServer7003App
 * @description:
 * @author: wuzx
 * @create: 2019-08-16 17:58
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer //启用EurekaServer服务器端启动类，接受其他微服务注册进来
public class EurekaServer7003App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003App.class, args);
    }
}
