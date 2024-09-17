package org.example.service;

import org.example.annotations.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CustomerService {
    private Logger logger = Logger.getLogger(CustomerService.class.getName());

    @ToLog
    public String publish() {
        logger.info("Publishing :::");
        return "Success";
    }
}
