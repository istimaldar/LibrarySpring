package com.netcracker.istimaldar.library.factory;


import com.netcracker.istimaldar.library.dao.*;
import com.netcracker.istimaldar.library.impl.*;

/**
 * Created by istimaldar
 */
public class DAOFactoryImpl implements DAOFactory {
    private static class MySqlDAOFactorySingletonHolder {
        static final DAOFactoryImpl INSTANCE = new DAOFactoryImpl();
    }

    @Override
    public AuthorDAO getAuthorDAO() {
        return AuthorDAOImpl.getInstance();
    }

    @Override
    public BookDAO getBookDAO() {
        return BookDAOImpl.getInstance();
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return CustomerDAOImpl.getInstance();
    }

    @Override
    public GenreDAO getGenreDAO() {
        return GenreDAOImpl.getInstance();
    }

    @Override
    public OrderDAO getOrderDAO() {
        return OrderDAOImpl.getInstance();
    }

    @Override
    public UserDAO getUserDAO() {
        return UserDAOImpl.getInstance();
    }

    public static DAOFactory getInstance() {
        return MySqlDAOFactorySingletonHolder.INSTANCE;
    }
}
