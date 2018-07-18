package com.kodilla.patterns_2.decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends PizzaDecorator {

    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ham";
    }
}


