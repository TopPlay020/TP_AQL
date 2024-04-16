package Exercice2;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public boolean createOrder(Order order) {
        return orderService.createOrder(order);
    }
}

