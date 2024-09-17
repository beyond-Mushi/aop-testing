package org.example.logger;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class PerformanceLogger {
    private Logger logger = Logger.getLogger(PerformanceLogger.class.getName());

    @Around("@annotation(org.example.annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method starting ::::");
        Object returnedValue = joinPoint.proceed();
        logger.info("::::"+returnedValue);
        return "Failed";
    }
}
