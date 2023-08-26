package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrder implements PizzaOrder {
    private PizzaOrder pizzaOrder;

    protected AbstractPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}
