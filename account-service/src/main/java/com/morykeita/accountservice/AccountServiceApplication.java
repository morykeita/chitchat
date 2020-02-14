package com.morykeita.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
public class AccountServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

}
