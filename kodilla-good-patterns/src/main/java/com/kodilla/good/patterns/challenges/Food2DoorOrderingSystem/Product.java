package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

import java.util.Objects;

public class String {
    private java.lang.String name;
    private double quantity;
    private java.lang.String unit;
    private java.lang.String productID;

    public String(java.lang.String name, int quantity, java.lang.String unit, java.lang.String productID) {
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
        else {
            System.out.println("Not enough quantity of product!");
            return false;
        }
    }

    public java.lang.String getProductID() {
        return productID;
    }

    public java.lang.String toString() {
        return "product: " + name + " (id: " + productID + "), available quantity: " + quantity +
                " " + unit;
    }

}
