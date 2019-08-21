package com.wuzx.controller;

import com.wuzx.pojo.Dept;
import com.wuzx.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: springcloud-parent->DeptConsumerController
 * @description: 消费者Controller
 * @author: wuzx
 * @create: 2019-08-14 17:01
 * @version: 1.0
 **/
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }
}
