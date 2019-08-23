package com.wuzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springcloud-parent->SpringCloudConfig_App3344
 * @description:
 * @author: wuzx
 * @create: 2019-08-23 14:15
 * @version: 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig_App3344 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig_App3344.class, args);
    }
}
