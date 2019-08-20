package com.wuzx.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
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

    /**
     * 显示声明就可以替换负载均衡算法
     * @return
     */
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();//达到的目的，用我们重新选择的随机算法替换默认的轮询算法
    }
}

