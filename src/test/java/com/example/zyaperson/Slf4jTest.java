package com.example.zyaperson;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class Slf4jTest {

    private static Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    void test1() {
        LOGGER.info("this is info");
        LOGGER.debug("this is debug");
        LOGGER.warn("this is warn");
        LOGGER.error("this is error");

        log.error("er");
    }

}
