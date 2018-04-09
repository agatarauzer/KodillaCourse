package com.kodilla.good.patterns.challenges.OrderingSystem;

import java.time.LocalDateTime;

public interface OrderingService {
    boolean order(User user, LocalDateTime date);
}
