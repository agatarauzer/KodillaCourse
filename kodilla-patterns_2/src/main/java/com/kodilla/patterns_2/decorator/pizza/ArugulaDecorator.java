package com.kodilla.patterns_2.decorator.pizza;


public class ArugulaDecorator extends PizzaDecorator {

    public ArugulaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", arugula";
    }
}
