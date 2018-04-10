package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;


public class Product {
    private String name;
    private double quantity;
    private String unit;
    private String productID;

    public Product(String name, int quantity, String unit, String productID) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.productID = productID;
    }

    public boolean isAvailableIn(double orderingQuantity) {
        if (quantity - orderingQuantity >= 0) {
            quantity -= orderingQuantity;
            return true;
        }
        return false;
    }

    public String getProductID() {
        return productID;
    }

    public double getQuantity() {
        return quantity;
    }

    public String toString() {
        return "product: " + name + " (id: " + productID + "), available quantity: " + quantity +
                " " + unit;
    }
}
