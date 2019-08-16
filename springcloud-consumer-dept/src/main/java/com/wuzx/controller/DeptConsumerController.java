package com.wuzx.controller;

import com.wuzx.pojo.Dept;
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
    private static final String REST_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;//提供福哦中边界访问http服务方法

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable Long id) {
        return restTemplate.getForObject(REST_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return restTemplate.getForObject(REST_PREFIX + "/dept/list", List.class);
    }
    @RequestMapping(value = "/consumer/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        return restTemplate.getForObject(REST_PREFIX + "/dept/discovery", Object.class);
    }
}
