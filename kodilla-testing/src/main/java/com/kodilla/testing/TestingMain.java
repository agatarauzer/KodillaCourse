package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;

        int addResult = calculator.add(a, b);
        if (addResult == 30) {
            System.out.println("Addition - correct result");
        }
        else {
            System.out.println("Addition - wrong result");
        }

        int subtractResult = calculator.subtract(b, a);
        if (subtractResult == 10) {
            System.out.println("Subtraction - correct result");
        }
        else {
            System.out.println("Subtraction - wrong result");
        }
    }
}
