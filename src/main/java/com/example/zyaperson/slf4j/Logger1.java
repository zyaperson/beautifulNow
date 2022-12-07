package com.example.zyaperson.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger1 {
    private static Logger LOGGER = LoggerFactory.getLogger(Logger1.class);

    static {
        LOGGER.info("This is logger1");
    }
}
