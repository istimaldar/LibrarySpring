package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Author;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by istimaldar
 */
public class AuthorDAOImpl implements GenericDAO<Author> {

    private SessionFactory sessionFactory;

    public AuthorDAOImpl() {

    }

    @Override
    public void create(Author object) {
        sessionFactory.persist(object);
    }

    @Override
    public Author readById(int id) {
        return sessionFactory.find(Author.class, id);
    }

    @Override
    public void update(Author object) {
        sessionFactory.merge(object);
    }

    @Override
    public void deleteById(int id) {
        Author book = sessionFactory.find(Author.class, id);
        if (book != null) {
            sessionFactory.remove(book);
        }
    }

    @Override
    public List<Author> getAll() {
        return null;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
