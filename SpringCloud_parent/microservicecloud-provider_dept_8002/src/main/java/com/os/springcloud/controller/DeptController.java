package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制器
 *
 * @RestController=@Controller+@ResponseBody
 */
@RestController
public class DeptController {

    @Resource
    private DeptService deptService;
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("showDeptAll")
    public List<Dept> showDeptAll() {
        List<Dept> list = deptService.findAll();
        return list;
    }

    /**
     * 拿到当前微服务的摘要信息
     */
    @RequestMapping("getService")
    public Object getService() {
        List<String> list = discoveryClient.getServices();
        System.out.println("list:" + list);
        List<ServiceInstance> instanceList = discoveryClient.getInstances("SpringCloud");
        for (ServiceInstance info : instanceList) {
            System.out.println("info.getHost():" + info.getHost());
            System.out.println("info.getPort():" + info.getPort());
            System.out.println("info.getServiceId():" + info.getServiceId());
            System.out.println("info.getUri():" + info.getUri());
            System.out.println("info.getMetadata():" + info.getMetadata());
        }
        return this.discoveryClient;
    }
}
