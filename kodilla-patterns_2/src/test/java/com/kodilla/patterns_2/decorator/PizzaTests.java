package com.kodilla.patterns_2.decorator;

import com.kodilla.patterns_2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PizzaTests {

    private Pizza pizza;

    @Before
    public void createBasicPizza() {
        pizza = new PizzaMargherita();
    }

    @Test
    public void pizzaWithDoubleCheeseAndArugula_getCostTest() {

        //Given
        pizza = new CheeseDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);

        //When
        double cost = pizza.getCost();

        //Then
        Assert.assertEquals(18.0, cost, 0.001);
    }

    @Test
    public void pizzaWithHamAndArugula_getDescriptionTest() {
        //Given
        pizza = new HamDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        Assert.assertEquals("Pizza with tomato sauce, cheese, ham, arugula", description);
    }
}
