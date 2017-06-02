package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.UserDAO;
import com.netcracker.istimaldar.library.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class UserDAOImpl implements UserDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private UserDAOImpl() {

    }

    private static class UserSingletonHolder {
        static final UserDAOImpl INSTANCE = new UserDAOImpl();
    }

    public static UserDAO getInstance() {
        return UserSingletonHolder.INSTANCE;
    }

    @Override
    public void createUser(User user) throws SQLException {
        entityManager.persist(user);
    }

    @Override
    public User readUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User readUserByLogin(String login) {
        return null;
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUserById(int id) {
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
