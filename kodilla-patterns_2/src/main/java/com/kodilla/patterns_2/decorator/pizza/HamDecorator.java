package com.kodilla.patterns_2.decorator.pizza;


public class HamDecorator extends PizzaDecorator {

    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ham";
    }
}


