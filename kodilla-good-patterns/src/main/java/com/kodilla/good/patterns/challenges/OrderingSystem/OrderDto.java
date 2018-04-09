package com.kodilla.good.patterns.challenges.OrderingSystem;

public class OrderDto {

    public User user;
    public boolean orderCompleted;

    public OrderDto(final User user, final boolean orderCompleted) {
        this.user = user;
        this.orderCompleted = orderCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}
