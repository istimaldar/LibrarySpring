package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.AuthorDAO;
import com.netcracker.istimaldar.library.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class AuthorDAOImpl implements AuthorDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private AuthorDAOImpl() {

    }

    private static class AuthorSingletonHolder {
        static final AuthorDAOImpl INSTANCE = new AuthorDAOImpl();
    }

    public static AuthorDAO getInstance() {
        return AuthorSingletonHolder.INSTANCE;
    }

    @Override
    public void createAuthor(Author author) throws SQLException {
        entityManager.persist(author);
    }

    @Override
    public Author readAuthorById(int id) {
        return entityManager.find(Author.class, id);
    }

    @Override
    public void updateAuthor(Author author) {
        entityManager.merge(author);
    }

    @Override
    public void deleteAuthorById(int id) {
        Author author = entityManager.find(Author.class, id);
        if (author != null) {
            entityManager.remove(author);
        }
    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
