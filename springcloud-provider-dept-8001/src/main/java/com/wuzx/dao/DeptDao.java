package com.wuzx.dao;

import com.wuzx.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: springcloud-parent->DeptDao
 * @description: 部门
 * @author: wuzx
 * @create: 2019-08-14 15:09
 * @version: 1.0
 **/

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
