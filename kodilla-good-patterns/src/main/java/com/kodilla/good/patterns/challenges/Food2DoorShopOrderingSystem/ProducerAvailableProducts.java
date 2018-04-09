package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class ProducerAvailableProducts implements ChangeQuantity {
    private List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void showAvailableProducts() {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    public boolean isProductAvailable(Product product) {
        return productsList.contains(product);
    }

    public boolean getQuantityOf(Product product, double quantity) {
        if (isProductAvailable(product)) {
            if (product.getQuantityOfProduct(quantity)) {
                return true;
            }
        }
        return false;
    }
}
