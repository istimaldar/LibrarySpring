package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Author;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface AuthorDAO {
    int createAuthor(Author author) throws SQLException;
    Author readAuthorById(int id);
    boolean updateAuthor(Author author);
    void deleteAuthorById(int id);
    List<Author> getAll();
}
