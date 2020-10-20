package com.wusiq;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Log4j2
@EnableAsync
@EnableScheduling
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.wusiq")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.debug("main run success...");
    }
}
