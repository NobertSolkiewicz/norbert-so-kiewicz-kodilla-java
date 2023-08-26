package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HotSpicyPizzaOrderDecorator extends AbstractPizzaOrder {

    protected HotSpicyPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with jalapeno, ham, hot sauce";
    }
}
