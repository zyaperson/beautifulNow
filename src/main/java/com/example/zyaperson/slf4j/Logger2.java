package com.example.zyaperson.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger2 {
    private static Logger LOGGER = LoggerFactory.getLogger(Logger2.class);

    static {
        LOGGER.info("This is logger2");
    }

}
