package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        numbers = new int[20];
        System.out.println(IntStream.range(numbers[0], numbers[20]));

        return IntStream.range(numbers[0], numbers[20]).average().getAsDouble();
    }
}
