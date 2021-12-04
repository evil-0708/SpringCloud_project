package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 消费者子项目控制器
 */
@RestController
public class DeptController_Consumer {

    // 定义变量存放通用的部分网址
    private static final String REST_URL_PREFIX = "http://springcloud";
    @Resource
    private RestTemplate template;

    @RequestMapping("showAllConsumer")
    public List<Dept> showAllConsumer() {
        // url为提供者的访问路径
        List<Dept> list = template.getForObject(REST_URL_PREFIX + "/showDeptAll", List.class);
        return list;
    }

    /**
     * 获取“提供者”子项目中微服务的信息
     */
    @RequestMapping("getServiceInfoByConsumer")
    public Object getServiceInfoByConsumer() {
        Object object = template.getForObject(REST_URL_PREFIX + "/getService", Object.class);
        return object;
    }
}
