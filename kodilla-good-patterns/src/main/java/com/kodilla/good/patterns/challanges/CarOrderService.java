package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class CarOrderService implements OrderService{
    @Override
    public boolean rent(User user, LocalDateTime OrderFrom, LocalDateTime OrderTo) {
        return false;
    }
}
