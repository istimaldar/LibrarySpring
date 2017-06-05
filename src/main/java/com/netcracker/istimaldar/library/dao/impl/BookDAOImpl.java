package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by istimaldar
 */
public class BookDAOImpl implements GenericDAO<Book> {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private BookDAOImpl() {

    }

    @Override
    public void create(Book book) {
        entityManager.persist(book);
    }

    @Override
    public Book readById(int id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void update(Book book) {
        entityManager.merge(book);
    }

    @Override
    public void deleteById(int id) {
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
