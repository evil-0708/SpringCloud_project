package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController_Consumer {

    @Resource
    private DeptClientService deptClientService;


    @RequestMapping("showAllDeptAllByFeign")
    public List<Dept> showAllDeptAllByFeign() {
        List<Dept> list = deptClientService.findAll();
        return list;
    }
}
