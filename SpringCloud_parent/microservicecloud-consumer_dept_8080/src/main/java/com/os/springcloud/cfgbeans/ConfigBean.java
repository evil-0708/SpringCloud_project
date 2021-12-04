package com.os.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 把当前类交给Spring框架管理
 */
@Configuration
public class ConfigBean {
    /**
     * 把当前方法交给Spring框架管理，并且创建完对象存放到Spring中
     */
    @Bean
    @LoadBalanced
    public RestTemplate getConfigBean() {
        RestTemplate template = new RestTemplate();
        return template;
    }
}
