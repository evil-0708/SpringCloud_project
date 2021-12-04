package com.os.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul9527_APP {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Zuul9527_APP.class).web(true).run(args);

    }
}
