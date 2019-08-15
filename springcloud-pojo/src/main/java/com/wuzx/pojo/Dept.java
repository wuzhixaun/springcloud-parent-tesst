package com.wuzx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: springcloud-parent->Dept
 * @description:
 * @author: wuzx
 * @create: 2019-08-13 18:01
 * @version: 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    //主键
    private Long deptno;
    //部门名称
    private String dName;
    //数据库
    private String db_source;
}
