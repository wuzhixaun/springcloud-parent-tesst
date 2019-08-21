package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: springcloud-parent->DeptProvideApp
 * @description:Dept启动类
 * @author: wuzx
 * @create: 2019-08-14 15:57
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进Eureka服务中
@EnableDiscoveryClient //服务发现
@EnableHystrix //开启熔断器
public class DeptProvideApp_Hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvideApp_Hystrix_8001.class,args);
    }
}
