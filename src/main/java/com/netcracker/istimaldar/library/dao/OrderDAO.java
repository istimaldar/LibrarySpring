package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface OrderDAO {
    void createOrder(Order order) throws SQLException;
    Order readOrderById(int id);
    void updateOrder(Order order);
    void deleteOrderById(int id);
    List<Order> getAll();
}
