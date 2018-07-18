package com.kodilla.patterns_2.decorator.pizza;

import java.math.BigDecimal;

public class ArugulaDecorator extends PizzaDecorator {

    public ArugulaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", arugula";
    }
}
