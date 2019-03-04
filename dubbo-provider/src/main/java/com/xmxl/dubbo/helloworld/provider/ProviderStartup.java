package com.xmxl.dubbo.helloworld.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author songmy
 */
@SpringBootApplication
//@EnableDubbo
@ImportResource(locations = {"classpath:dubbo-provider.xml"})
public class ProviderStartup {

    public static void main(String[] args) {
        SpringApplication.run(ProviderStartup.class, args);
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
