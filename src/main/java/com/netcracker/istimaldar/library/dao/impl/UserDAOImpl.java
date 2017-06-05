package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by istimaldar
 */
public class UserDAOImpl implements GenericDAO<User> {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public User readById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteById(int id) {
        User order = entityManager.find(User.class, id);
        if (order != null) {
            entityManager.remove(order);
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
