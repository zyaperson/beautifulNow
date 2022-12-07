package com.example.zyaperson.slf4j;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Main {
    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        new Logger1();
        new Logger2();
        new Logger3();
        //
        LOGGER.debug("this is debug");
        LOGGER.info("this is info");
        LOGGER.warn("this is warn");
        LOGGER.error("this is error");
        //
        log.debug("debug");
        log.info("debug");
        log.warn("debug");
        log.error("debug");
    }
}
