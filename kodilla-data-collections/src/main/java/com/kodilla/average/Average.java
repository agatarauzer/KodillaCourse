package com.kodilla.average;

public class Average {
    public static void main (String[] args) {

        final int elements = 20;
        int[] numbers = new int[elements];
        int sum = 0;

        System.out.println("Numbers in array: ");

        for (int i = 0; i < elements; i++) {
            numbers[i] = i * 3;
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        double average = (double)sum / elements;

        System.out.println("\nThe average of numbers in array is: " + average);
    }
}
