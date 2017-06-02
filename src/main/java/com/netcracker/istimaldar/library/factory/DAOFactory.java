package com.netcracker.istimaldar.library.factory;

import com.netcracker.istimaldar.library.dao.*;

/**
 * Created by istimaldar
 */
public interface DAOFactory {
    AuthorDAO getAuthorDAO();
    BookDAO getBookDAO();
    CustomerDAO getCustomerDAO();
    GenreDAO getGenreDAO();
    OrderDAO getOrderDAO();
    UserDAO getUserDAO();
}
