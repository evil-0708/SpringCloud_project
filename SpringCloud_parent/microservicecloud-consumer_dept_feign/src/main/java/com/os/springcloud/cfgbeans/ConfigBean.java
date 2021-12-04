package com.os.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }

    /**
     * 将顺序显示访问数据修改改为随机显示数据
     * @return
     */
    @Bean
    public IRule iRule() {
        // 将负载均衡显示数据顺序，改为随机访问
        // 轮询算法
        RandomRule randomRule = new RandomRule();
        return randomRule;
    }
}
