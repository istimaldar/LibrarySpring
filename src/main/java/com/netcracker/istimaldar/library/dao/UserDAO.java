package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface UserDAO {
    void createUser(User user) throws SQLException;
    User readUserById(int id);
    User readUserByLogin(String login);
    void updateUser(User user);
    void deleteUserById(int id);
    List<User> getAll();
}
