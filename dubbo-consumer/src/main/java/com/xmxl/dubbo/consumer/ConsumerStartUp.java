package com.xmxl.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author songmy
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.xmxl.dubbo.consumer")
public class ConsumerStartUp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStartUp.class,args);
    }
}
