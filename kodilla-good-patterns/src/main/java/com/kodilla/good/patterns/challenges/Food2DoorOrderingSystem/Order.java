package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;


public class Order {
    private String productId;
    private double quantity;

    public Order(String productId, double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }
}
