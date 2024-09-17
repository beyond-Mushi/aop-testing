package org.example;

import org.example.config.AppConfig;
import org.example.logger.PerformanceLogger;
import org.example.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);
        var service = c.getBean(CustomerService.class);
        logger.info(service.publish());

    }
}