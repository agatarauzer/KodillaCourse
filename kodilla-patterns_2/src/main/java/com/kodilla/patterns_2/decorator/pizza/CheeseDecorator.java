package com.kodilla.patterns_2.decorator.pizza;


public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", additional cheese";
    }
}
