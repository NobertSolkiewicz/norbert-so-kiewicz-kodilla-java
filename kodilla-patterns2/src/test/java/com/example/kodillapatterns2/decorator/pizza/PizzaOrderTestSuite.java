package com.example.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza", description);
    }

    @Test
    public void testJinxPizzaOrderWithJalapenoThicCrustGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new JinxPizzaOrderDecorator(theOrder);
        theOrder = new JalapenoPizzaDecorator(theOrder);
        theOrder = new thinCrustDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculatedCost);
    }

    @Test
    public void testJinxPizzaOrderWithJalapenoThicCrustGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new JinxPizzaOrderDecorator(theOrder);
        theOrder = new JalapenoPizzaDecorator(theOrder);
        theOrder = new thinCrustDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza with fires + salami + arugula + jalapeno thin crust", description);
    }
}
