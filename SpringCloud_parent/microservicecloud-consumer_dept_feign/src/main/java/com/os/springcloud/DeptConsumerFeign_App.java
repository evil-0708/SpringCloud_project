package com.os.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.os.springcloud.service"})
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DeptConsumerFeign_App.class).web(true).run(args);
    }
}
