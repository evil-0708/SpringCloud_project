package com.os.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
@EnableHystrixDashboard
public class DeptConsumer_Dashboard9001_App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(DeptConsumer_Dashboard9001_App.class).web(true).run(args);
        String property = run.getEnvironment().getProperty("server.port");
        log.info("http://localhost:" + property + "/hystrix");
    }
}
