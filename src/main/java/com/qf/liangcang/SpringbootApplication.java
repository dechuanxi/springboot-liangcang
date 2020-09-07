package com.qf.liangcang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author WDZ
 */
@SpringBootApplication
@MapperScan(basePackages = "com.qf.liangcang.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.qf.liangcang.SpringbootApplication.class, args);
    }

}
