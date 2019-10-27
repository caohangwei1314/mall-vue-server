package com.caohangwei.mallvueserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.caohangwei.mallvueserver.mapper")
public class MallVueServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallVueServerApplication.class, args);
    }

}
