package com.rtttx.eruka.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Autohor: scorpio
 * @Description:
 * @Date: Created in 2018/9/17 0017 下午 15:18
 * @Modified By:
 */

@SpringBootApplication
@EnableEurekaServer
public class ErukaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErukaApplication.class, args);
    }
}