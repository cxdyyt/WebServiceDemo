package com.interview.bank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.interview.bank.mapper")
public class BankdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankdemoApplication.class, args);
    }

}
