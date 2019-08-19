package com.wuzx.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-parent->ConfigBean
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 16:55
 * @version: 1.0
 **/
@Configuration //变成配置类
public class ConfigBean {//boot - spring application.xml

    @Bean
    @LoadBalanced //SpringCloud ribbon是基于Netflix Ribbon的一套客户端 负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

