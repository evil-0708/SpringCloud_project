package com.os.springcloud;

import com.os.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 消费者启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "springcloud", configuration = CustomRule.class)
public class DeptConsumer8080_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8080_App.class, args);
    }
}
