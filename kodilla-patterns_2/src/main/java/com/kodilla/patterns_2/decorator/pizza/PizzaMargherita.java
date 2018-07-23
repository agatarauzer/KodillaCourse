package com.kodilla.patterns_2.decorator.pizza;


public class PizzaMargherita implements Pizza {

    @Override
    public double getCost() {
        return 15.0;
    }

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce, cheese";
    }
}
