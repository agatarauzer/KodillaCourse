package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

public class OrderProcessor {

    private static final String ORDER_COMPLETED = "Order successfully completed.";
    private static final String ORDER_NOT_COMPLETED = "Order not completed!";

    public OrderProcessor(Producer producer, Order order) {
        boolean isOrdered = producer.process(order);

        if (isOrdered) {
            System.out.println(ORDER_COMPLETED);
        }
        else {
            System.out.println(ORDER_NOT_COMPLETED);
        }
    }
}
