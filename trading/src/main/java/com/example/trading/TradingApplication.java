package com.example.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.trading.repository")
@EntityScan(basePackages = "com.example.trading.model")
public class TradingApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradingApplication.class, args);
    }
}
