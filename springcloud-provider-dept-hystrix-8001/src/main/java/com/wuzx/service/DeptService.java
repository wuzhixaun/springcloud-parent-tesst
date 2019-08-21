package com.wuzx.service;

import com.wuzx.pojo.Dept;

import java.util.List;

/**
 * @program: springcloud-parent->DeptService
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 15:32
 * @version: 1.0
 **/

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
