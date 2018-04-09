package com.kodilla.good.patterns.challenges.OrderingSystem;

import java.time.LocalDateTime;

public class ClothesOrdersRepository implements OrdersRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime date) {
        return true;
    }
}
