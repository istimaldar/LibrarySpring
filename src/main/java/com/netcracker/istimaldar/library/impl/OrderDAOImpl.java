package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.OrderDAO;
import com.netcracker.istimaldar.library.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class OrderDAOImpl implements OrderDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private OrderDAOImpl() {

    }

    private static class OrderSingletonHolder {
        static final OrderDAOImpl INSTANCE = new OrderDAOImpl();
    }

    public static OrderDAO getInstance() {
        return OrderSingletonHolder.INSTANCE;
    }

    @Override
    public void createOrder(Order order) throws SQLException {
        entityManager.persist(order);
    }

    @Override
    public Order readOrderById(int id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public void updateOrder(Order order) {
        entityManager.merge(order);
    }

    @Override
    public void deleteOrderById(int id) {
        Order order = entityManager.find(Order.class, id);
        if (order != null) {
            entityManager.remove(order);
        }
    }

    @Override
    public List<Order> getAll() {
        return null;
    }
}
