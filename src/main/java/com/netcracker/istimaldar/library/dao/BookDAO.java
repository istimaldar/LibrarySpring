package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface BookDAO {
    int createBook(Book book) throws SQLException;
    Book readBookById(int id);
    boolean updateBook(Book book);
    void deleteBookById(int id);
    List<Book> getAll();
}
