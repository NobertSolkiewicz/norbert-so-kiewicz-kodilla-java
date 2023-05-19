package com.kodilla.paterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void TestGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("Something");

        //When
        logger.getLastLog();

        //Then
        assertEquals(logger.getLastLog(), "Something");
    }
}
