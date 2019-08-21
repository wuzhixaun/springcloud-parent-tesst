package com.wuzx.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wuzx.pojo.Dept;
import com.wuzx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloud-parent->DeptController
 * @description: controller
 * @author: wuzx
 * @create: 2019-08-14 15:42
 * @version: 1.0
 **/

@Controller
@ResponseBody
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)

    /**
     * 一旦调用服务失败并跑出异常信息后,会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定反方
     */
//    @HystrixCommand(fallbackMethod = "hystrix_get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.findById(id);
        if (dept == null) {
            throw new RuntimeException("改ID:" + id + "没有对应的信息");
        }
        return dept;
    }

    public Dept hystrix_get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDName("改ID:" + id + "没有对应的信息,null--@HystrixCom mand")
                .setDb_source(" no this database in Data");
    }


}
