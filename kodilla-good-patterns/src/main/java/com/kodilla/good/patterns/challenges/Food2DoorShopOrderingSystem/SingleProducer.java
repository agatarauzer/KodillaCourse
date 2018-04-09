package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;


public class SingleProducer implements Producer {
    private String name;
    private ProducerAvailableProducts products;

    public SingleProducer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.addProduct(product);
    }

    public boolean process(Order order) {
            return products.getQuantityOf(order.getProduct(), order.getQuantity());
    }

}

