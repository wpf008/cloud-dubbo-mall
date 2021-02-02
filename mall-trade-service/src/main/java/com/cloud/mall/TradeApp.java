package com.cloud.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午5:17
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TradeApp {

    public static void main(String[] args) {
        SpringApplication.run(TradeApp.class, args);
    }
}
