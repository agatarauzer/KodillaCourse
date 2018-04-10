package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

public class OrderProcessor {
    private static final String ORDER_COMPLETED = "Order successfully completed.";
    private static final String ORDER_NOT_COMPLETED = "Order not completed!";

    public boolean processOrder(Producers producersList, Producer producer, Order order) {
        isProducerAvailable(producersList, producer);
        boolean isOrdered = producer.process(order);
        if (isOrdered) {
            System.out.println(ORDER_COMPLETED);
            return true;
        }
        else {
            System.out.println(ORDER_NOT_COMPLETED);
            return false;
        }
    }

    private boolean isProducerAvailable(Producers producersList, Producer producer) {
        return producersList.isProducerInBase(producer);
    }
}
