package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime OrderFrom, LocalDateTime OrderTo);
}
