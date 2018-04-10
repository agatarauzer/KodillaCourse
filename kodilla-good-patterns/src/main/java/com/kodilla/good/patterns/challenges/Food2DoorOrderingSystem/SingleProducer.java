package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class SingleProducer implements Producer {
    private String name;
    private List<Product> products;

    public SingleProducer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showAvailableProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public boolean process(Order order) {
            return isQuantityOfProductAvailable(order.getProductId(), order.getQuantity());
    }

    private boolean isQuantityOfProductAvailable(String productId, double quantity) {
        for (Product product : products) {
            if (product.getProductID().equals(productId)) {
                if (product.isAvailableIn(quantity)) {
                    return true;
                }
            }
        }
        return false;
    }
}

