package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiiPizzaOrderDecorator extends AbstractPizzaOrder {

    protected HawaiiPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with pineapple";
    }
}
