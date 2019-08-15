package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-parent->EurekaServer7001App
 * @description: EurekaServer
 * @author: wuzx
 * @create: 2019-08-15 17:19
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer //启用EurekaServer服务器端启动类，接受其他微服务注册进来
public class EurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class, args);
    }
}
