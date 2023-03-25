package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 3)));
    }
}
