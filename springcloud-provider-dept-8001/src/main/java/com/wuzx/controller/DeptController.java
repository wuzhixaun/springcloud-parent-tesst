package com.wuzx.controller;

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
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept add(@PathVariable Long id) {
        return deptService.findById(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.findAll();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object disconvery() {
        //获取所有在Eureka的拥有所有的微服务
        List<String> list = discoveryClient.getServices();
        System.out.println("***********" + list);

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("SPRINGCLOUD-DEPT");
        for (ServiceInstance instance : serviceInstanceList) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t"
                    + instance.getUri());
        }
        return this.discoveryClient;
    }

}
