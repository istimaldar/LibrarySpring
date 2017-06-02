package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.CustomerDAO;
import com.netcracker.istimaldar.library.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class CustomerDAOImpl implements CustomerDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private CustomerDAOImpl() {

    }

    private static class CustomerSingletonHolder {
        static final CustomerDAOImpl INSTANCE = new CustomerDAOImpl();
    }

    public static CustomerDAO getInstance() {
        return CustomerSingletonHolder.INSTANCE;
    }

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        entityManager.persist(customer);
    }

    @Override
    public Customer readCustomerById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public void deleteCustomerById(int id) {
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
