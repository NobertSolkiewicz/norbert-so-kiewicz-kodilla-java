package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        SimpleProduct simpleProduct1 = new SimpleProduct("Product 1", 17.28);
        SimpleProduct simpleProduct2 = new SimpleProduct("Product 2", 11.99);
        SimpleProduct simpleProduct3 = new SimpleProduct("Product 3", 6.49);

        //When
        invoice.addItem(new SimpleItem(simpleProduct1, 2.0));
        invoice.addItem(new SimpleItem(simpleProduct2, 3.5));
        invoice.addItem(new SimpleItem(simpleProduct3, 5.0));

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);

    }
}
