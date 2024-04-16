package Exercice2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class OrderControllerTest {

    @Test
    public void createOrderTestSuccess() {
        OrderService mockOrderService = Mockito.mock(OrderService.class);
        OrderDao mockOrderDao = Mockito.mock(OrderDao.class);

        OrderService orderService = new OrderService(mockOrderDao);

        Order order = new Order(Order.NORMAL_TYPE , "somthing");

        Mockito.when(mockOrderDao.saveOrder(order)).thenReturn(false);
        Mockito.when(mockOrderService.createOrder(order)).thenReturn(false);

        OrderController orderController = new OrderController(mockOrderService);

        Assert.assertFalse(orderController.createOrder(order));
        Assert.assertFalse(orderService.createOrder(order));

        Mockito.verify(mockOrderService).createOrder(order);
        Mockito.verify(mockOrderDao).saveOrder(order);
    }

    @Test
    public void createOrderTestFailed() {
        OrderService mockOrderService = Mockito.mock(OrderService.class);
        OrderDao mockOrderDao = Mockito.mock(OrderDao.class);

        OrderService orderService = new OrderService(mockOrderDao);

        Order order = new Order(Order.NORMAL_TYPE , "somthing");

        Mockito.when(mockOrderDao.saveOrder(order)).thenReturn(false);
        Mockito.when(mockOrderService.createOrder(order)).thenReturn(false);

        OrderController orderController = new OrderController(mockOrderService);

        Assert.assertFalse(orderController.createOrder(order));
        Assert.assertFalse(orderService.createOrder(order));

        Mockito.verify(mockOrderService).createOrder(order);
        Mockito.verify(mockOrderDao).saveOrder(order);
    }
}
