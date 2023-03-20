package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] tab = new int[20];
        for (int i =0; i < tab.length; i++) {
            tab[i] = i;
        }

        //When
        ArrayOperations.getAverage(tab);


        //Then
        assertEquals(9.5, tab);


    }
}
