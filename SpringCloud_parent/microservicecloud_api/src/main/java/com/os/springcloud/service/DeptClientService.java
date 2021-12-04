package com.os.springcloud.service;

import com.os.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 实现负载均衡的接口
 */
@FeignClient(value = "springcloud")
public interface DeptClientService {

    @RequestMapping("showDeptAll")
    List<Dept> findAll();
}
