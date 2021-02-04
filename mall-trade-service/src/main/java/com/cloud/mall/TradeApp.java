package com.cloud.mall;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午5:17
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TradeApp {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }


    public static void main(String[] args) {
        SpringApplication.run(TradeApp.class, args);
    }
}
