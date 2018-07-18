package com.kodilla.patterns_2;

import com.kodilla.patterns_2.decorator.pizza.*;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
        BigDecimal cost = pizza.getCost();

        //Then
        Assert.assertThat(new BigDecimal(18.0), Matchers.comparesEqualTo(cost));
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
