package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class ArrayAverage implements ArrayOperations {

    public double getAverage(int[] numbers) {
        IntStream.of(numbers).forEach(System.out::println);

        double average = IntStream.range(numbers[0], numbers[numbers.length - 1])
                .average()
                .getAsDouble();

        return average;
    }
}
