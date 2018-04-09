package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

public class OrderProcessor {

    public OrderProcessor(Producer producer, Order order) {
        boolean isOrdered = producer.process(order);

        if(isOrdered) {
            System.out.println("Order successfully completed.");
        }
        else {
            System.out.println("Order not completed!");
        }
    }
}
