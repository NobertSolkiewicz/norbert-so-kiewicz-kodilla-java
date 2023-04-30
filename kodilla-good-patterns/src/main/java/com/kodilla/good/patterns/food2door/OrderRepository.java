package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime when);
}
