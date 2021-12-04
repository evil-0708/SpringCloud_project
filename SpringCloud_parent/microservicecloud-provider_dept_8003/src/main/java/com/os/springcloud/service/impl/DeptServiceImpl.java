package com.os.springcloud.service.impl;

import com.os.springcloud.dao.DeptDao;
import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层（实现类）
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;
    @Override
    public List<Dept> findAll() {
        List<Dept> list = deptDao.selectAll();
        return list;
    }
}
