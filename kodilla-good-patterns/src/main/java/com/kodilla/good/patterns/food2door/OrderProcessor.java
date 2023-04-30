package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private InfomationService infomationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InfomationService infomationService) {
        this.infomationService = infomationService;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getUser(), orderRequest.getWhen());
        if (isRented) {
            infomationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getWhen());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }

    }
}
