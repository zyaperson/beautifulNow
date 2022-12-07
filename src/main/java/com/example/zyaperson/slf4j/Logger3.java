package com.example.zyaperson.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger3 {
    private static Logger LOGGER = LoggerFactory.getLogger(Logger3.class);

    static {
        LOGGER.info("This is logger3");
    }

}
