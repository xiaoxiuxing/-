package com.gaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@EnableCaching//在项目入口处开启redis缓存
@MapperScan("com.gaoshu.mapper")//开启自动装载sql导入tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
