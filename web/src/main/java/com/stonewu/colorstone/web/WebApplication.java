package com.stonewu.colorstone.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication()
@MapperScan("com.stonewu.colorstone.web.mapper.*")
@ComponentScan(basePackages = {"com.stonewu.colorstone"})
@EnableFeignClients(basePackages = {"com.stonewu.colorstone.web"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
