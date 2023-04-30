package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Tomaszewski");

        LocalDateTime rentFrom = LocalDateTime.of(2023, 4, 30, 10, 18);
        LocalDateTime rentTo = LocalDateTime.of(2023, 5, 2, 10, 18);

        return new OrderRequest(user, rentFrom, rentTo);
    }
}
