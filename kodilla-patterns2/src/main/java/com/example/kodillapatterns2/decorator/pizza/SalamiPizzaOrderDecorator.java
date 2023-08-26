package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaOrderDecorator extends AbstractPizzaOrder {

    protected SalamiPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with salami";
    }
}
