package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface BookDAO {
    void createBook(Book book) throws SQLException;
    Book readBookById(int id);
    void updateBook(Book book);
    void deleteBookById(int id);
    List<Book> getAll();
}
