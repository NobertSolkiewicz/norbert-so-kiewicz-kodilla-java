package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime when;

    public OrderRequest(final User user, final LocalDateTime when) {
        this.user = user;
        this.when = when;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
