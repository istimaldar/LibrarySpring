package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Customer;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface CustomerDAO {
    int createCustomer(Customer customer) throws SQLException;
    Customer readCustomerById(int id);
    boolean updateCustomer(Customer customer);
    void deleteCustomerById(int id);
    List<Customer> getAll();
}
