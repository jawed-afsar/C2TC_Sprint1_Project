package com.tnsif.Order.service;

import com.tnsif.Order.entity.Order;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    List<Order> getOrdersByCustomer(Long customerId);
    Order updateOrderStatus(Long id, String status);
    void deleteOrder(Long id);
}
