package com.os.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomRule {
    /**
     * 将顺序显示访问数据修改改为随机显示数据
     * @return
     */
    @Bean
    public IRule iRule() {
        // 将负载均衡显示数据顺序，改为随机访问
        // 轮询算法
        com.netflix.loadbalancer.RandomRule randomRule = new com.netflix.loadbalancer.RandomRule();
        return randomRule;
    }
}
