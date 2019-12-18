package com.zh;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangheng
 * @date 2019/12/04
 */
@SpringBootApplication
@MapperScan("com.zh.mapper")
@EnableCaching
@EnableDubbo(scanBasePackages = "com.zh.service")
@PropertySource("classpath:dubbo.properties")
@EnableRabbit
public class ServiceStarter {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ServiceStarter.class);
        new CountDownLatch(1).await();
    }
}
