package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.BookDAO;
import com.netcracker.istimaldar.library.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class BookDAOImpl implements BookDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private BookDAOImpl() {

    }

    private static class BookSingletonHolder {
        static final BookDAOImpl INSTANCE = new BookDAOImpl();
    }

    public static BookDAO getInstance() {
        return BookSingletonHolder.INSTANCE;
    }

    @Override
    public void createBook(Book book) throws SQLException {
        entityManager.persist(book);
    }

    @Override
    public Book readBookById(int id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void updateBook(Book book) {
        entityManager.merge(book);
    }

    @Override
    public void deleteBookById(int id) {
        Book book = entityManager.find(Book.class, id);
        if (book != null) {
            entityManager.remove(book);
        }
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
