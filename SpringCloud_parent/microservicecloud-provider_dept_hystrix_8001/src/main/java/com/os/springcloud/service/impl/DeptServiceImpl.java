package com.os.springcloud.service.impl;

import com.os.springcloud.dao.DeptDao;
import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public Dept showById(Long id) {
        Dept dept = deptDao.selectById(id);
        return dept;
    }
}
