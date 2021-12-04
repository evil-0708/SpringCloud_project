package com.os.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@Slf4j
public class DeptProviderHystrix_App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(DeptProviderHystrix_App.class).web(true).run(args);
        String property = context.getEnvironment().getProperty("server.port");
        log.info("http://localhost:" + property + "/showDeptAll/");

    }
}
