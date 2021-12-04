package com.os.springcloud.service;

import com.os.springcloud.entities.Dept;

import java.util.List;

/**
 * 业务逻辑层（接口）
 */
public interface DeptService {

    List<Dept> findAll();
}
