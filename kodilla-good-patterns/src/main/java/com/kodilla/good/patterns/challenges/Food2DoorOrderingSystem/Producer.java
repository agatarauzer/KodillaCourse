package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

public interface Producer {
    boolean process(Order order);
    void addProduct(Product product);
    void showAvailableProducts();
}
