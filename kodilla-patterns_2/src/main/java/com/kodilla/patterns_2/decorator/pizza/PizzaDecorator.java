package com.kodilla.patterns_2.decorator.pizza;

public abstract class PizzaDecorator implements Pizza {

    private final Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
