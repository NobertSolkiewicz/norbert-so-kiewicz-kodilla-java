package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(4.2, 5.7);
        double resultSub = calculator.sub(6.2, 5.7);
        double resultMul = calculator.mul(4.2, 5.7);
        double resultDiv = calculator.div(11.4, 5.7);

        //Then
        assertEquals(9.9, resultAdd);
        assertEquals(0.5, resultSub);
        assertEquals(23.94, resultMul);
        assertEquals(2.0, resultDiv);

    }
}
