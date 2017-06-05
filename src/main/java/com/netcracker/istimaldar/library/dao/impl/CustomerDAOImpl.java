package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by istimaldar
 */
public class CustomerDAOImpl implements GenericDAO<Customer> {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    @Override
    public void create(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public Customer readById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void update(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public void deleteById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
