package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import userdefinerule.MySelfRule;

/**
 * @program: springcloud-parent->DeptConsumerApp
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 17:16
 * @version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，从而使配置生效
//形如 @RibbonClient(name="SPRINGCLOUD-DEPT",)
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration = {MySelfRule.class})
public class DeptConsumerApp_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp_9001.class, args);
    }
}
