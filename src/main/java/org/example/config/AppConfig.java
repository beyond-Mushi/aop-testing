package org.example.config;

import org.example.logger.PerformanceLogger;
import org.example.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public PerformanceLogger getPerformanceLogger() {
        return new PerformanceLogger();
    }

    @Bean
    public CustomerService of() {
        return new CustomerService();
    }
}
