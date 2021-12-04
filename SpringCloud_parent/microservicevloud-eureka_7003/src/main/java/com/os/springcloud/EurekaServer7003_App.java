package com.os.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer7003_App.class).web(true).run(args);
    }
}
