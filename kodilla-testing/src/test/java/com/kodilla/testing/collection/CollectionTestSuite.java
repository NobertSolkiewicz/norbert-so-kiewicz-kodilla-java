package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When create empty list, " +
        "then oddNumbersExterminator should return empty list"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        oddNumbersExterminator.exterminate(Arrays.asList());

        //Then
        System.out.println(oddNumbersExterminator.exterminate(Arrays.asList()));

    }

    @DisplayName("When create list with odd and even numbers, " +
            "then oddNumbersExterminator should return list with even numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


        //When
        oddNumbersExterminator.exterminate(Arrays.asList(1, 2, 5, 11, 0, -2, 191, 101010));

        //Then
        System.out.println(oddNumbersExterminator.exterminate(Arrays.asList(1, 2, 5, 11, 0, -2, 191, 101010)));

    }
}
