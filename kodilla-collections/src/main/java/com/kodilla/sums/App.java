package com.kodilla.sums;

import java.util.Random;

public class App {
    public static void main (String[] args) {

        Random random = new Random();
        int sumA = 1000;
        int sumB = 0;
        int counter = 0;

        while (sumA > sumB) {
            System.out.println("Loop " + counter + ". sum A = " + sumA + ", sum B = " + sumB);
            sumA += random.nextInt(10);
            sumB += random.nextInt(50);
            counter++;
        }
    }
}
