package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean rent(User user, LocalDateTime OrderFrom, LocalDateTime OrderTo);
}
