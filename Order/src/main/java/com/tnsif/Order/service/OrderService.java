package com.tnsif.Order.service;

import com.tnsif.Order.entity.Order;
import com.tnsif.Order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Create new order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Get orders by customer ID
    public List<Order> getOrdersByCustomer(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    // Update order payment status
//    public Order updateOrderStatus(Long id, String paymentstatus) {
//        Order order = orderRepository.findById(id).orElse(null);
//        if (order != null) {
//            order.setPaymentStatus(paymentstatus);
//            return orderRepository.save(order);
//        }
//        return null;
//    }
    
    public Order saveOrder(Order order) {
    	return orderRepository.save(order);
    }

    // Delete order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
