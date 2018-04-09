package com.kodilla.good.patterns.challenges.OrderingSystem;

public class Main {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformation(),
                new ClothesOrderingService(), new ClothesOrdersRepository());
        orderProcessor.process(order);
    }
}
