package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime when);
}
