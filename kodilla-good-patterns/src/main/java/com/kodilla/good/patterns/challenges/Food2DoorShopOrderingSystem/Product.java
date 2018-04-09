package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

import java.util.Objects;

public class Product {
    private String name;
    private double quantity;
    private String unit;

    public Product(String name, int quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public boolean getQuantityOfProduct(double orderingQuantity) {
        if (quantity - orderingQuantity >= 0) {
            quantity -= orderingQuantity;
            return true;
        }
        else {
            System.out.println("Not enough quantity of product!");
            return false;
        }
    }


    public String toString() {
        return "product: " + name + ", available quantity: " + quantity +
                " " + unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.quantity, quantity) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(unit, product.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, unit);
    }
}
