package com.ego.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class EgoGateway {
    public static void main(String[] args) {
        SpringApplication.run(EgoGateway.class);
        // 第一次提交
        System.out.println("hello1");
        // 第二次提交
        System.out.println("hello2");
        // 第三次提交
        System.out.println("hello3");
    }
}
