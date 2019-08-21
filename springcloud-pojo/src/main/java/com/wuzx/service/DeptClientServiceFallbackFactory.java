package com.wuzx.service;

import com.wuzx.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: springcloud-parent->DeptClientServiceFallbackFactory
 * @description: 熔断工厂类
 * @author: wuzx
 * @create: 2019-08-21 14:54
 * @version: 1.0
 **/
@Component//千万不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {

                return new Dept().setDeptno(id).setDName("该ID:"+id+"没有对应的信息,客户端提供的降级信息，此服务Provide已经关闭")
                        .setDb_source("no database in mysql ");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
