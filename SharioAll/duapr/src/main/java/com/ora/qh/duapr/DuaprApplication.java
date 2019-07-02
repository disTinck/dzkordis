package com.ora.qh.duapr;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 开启dubbo的自动配置
@EnableDubboConfiguration
public class DuaprApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuaprApplication.class, args);
    }

}
