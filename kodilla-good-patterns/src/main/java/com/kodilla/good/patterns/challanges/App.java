package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new CarOrderService(), new CarOrderRepository());
        productOrderService.process(orderRequest);
    }
}
