package com.kodilla.patterns_2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargherita implements Pizza {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce, cheese";
    }
}
