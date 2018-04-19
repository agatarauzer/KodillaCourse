package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTests {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(2.5, 2.5);
        double diff = calculator.sub(10, 7);
        double mul = calculator.mul(4, 6);
        double div = calculator.div(10, 4);

        //Then
        Assert.assertEquals(5.0, sum, 0.001);
        Assert.assertEquals(3.0, diff, 0.001);
        Assert.assertEquals(24.0, mul, 0.001);
        Assert.assertEquals(2.5, div, 0.001);

    }
}
