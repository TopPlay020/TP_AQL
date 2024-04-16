package Exercice2;

public class OrderService {
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public boolean createOrder(Order order) {
        return orderDao.saveOrder(order);
    }
}

