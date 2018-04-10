package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

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
            return isQuantityOfProductAvailable(order.getProduct(), order.getQuantity());
    }

    public boolean isQuantityOfProductAvailable(Product product, double quantity) {
        if (isProductAvailable(product)) {
            if (product.isAvailableIn(quantity)) {
                return true;
            }
        }
        return false;
    }

    private boolean isProductAvailable(Product product) {
        return products.contains(product);
    }
}

