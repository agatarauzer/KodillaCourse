package com.kodilla.patterns_2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", additional cheese";
    }
}
