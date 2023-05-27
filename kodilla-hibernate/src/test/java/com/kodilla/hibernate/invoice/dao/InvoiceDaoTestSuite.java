package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("XYZ");
        Product product2 = new Product("asda");
        Product product3 = new Product("qwe");
        Product product4 = new Product("polk");

        Item item1 = new Item(product1, new BigDecimal(1223), 32, new BigDecimal(1));
        Item item2 = new Item(product2, new BigDecimal(2341), 60, new BigDecimal(2));
        Item item3 = new Item(product3, new BigDecimal(9999), 10, new BigDecimal(3));
        Item item4 = new Item(product4, new BigDecimal(5421), 48, new BigDecimal(4));

        Invoice invoice = new Invoice("1");
        /*Invoice invoice2 = new Invoice("2");
        Invoice invoice3 = new Invoice("3");
        Invoice invoice4 = new Invoice("4");*/

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
