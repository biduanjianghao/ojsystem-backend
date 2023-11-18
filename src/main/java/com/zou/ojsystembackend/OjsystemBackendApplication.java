package com.zou.ojsystembackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zou.ojsystembackend.mapper")
@SpringBootApplication
public class OjsystemBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OjsystemBackendApplication.class, args);
    }

}
