package com.os.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @RequestMapping(value = "showDeptAll/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_id")
    public Dept findById(@PathVariable("id") Long id) {
        Dept dept = this.deptService.showById(id);
        if (dept != null) {
            return dept;
        } else {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
    }

    @RequestMapping("processHystrix_id")
    public Dept processHystrix_id(@PathVariable("id") Long id) {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("此ID" + id + "没有对应的信息");
        dept.setDb_source("没有对应的数据库");
        return dept;
    }

}
