package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;


public class Order {
    private Product product;
    private double quantity;

    public Order(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
