package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by istimaldar
 */
public class OrderDAOImpl implements GenericDAO<Order> {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    @Override
    public void create(Order order) {
        entityManager.persist(order);
    }

    @Override
    public Order readById(int id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public void update(Order order) {
        entityManager.merge(order);
    }

    @Override
    public void deleteById(int id) {
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
