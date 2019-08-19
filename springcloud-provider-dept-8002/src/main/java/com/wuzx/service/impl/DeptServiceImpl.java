package com.wuzx.service.impl;

import com.wuzx.dao.DeptDao;
import com.wuzx.pojo.Dept;
import com.wuzx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud-parent->DeptServiceImpl
 * @description:
 * @author: wuzx
 * @create: 2019-08-14 15:34
 * @version: 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
