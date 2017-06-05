package com.netcracker.istimaldar.library.dao.impl;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Genre;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by istimaldar
 */
public class GenreDAOImpl implements GenericDAO<Genre> {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    @Override
    public void create(Genre genre) {
        entityManager.persist(genre);
    }

    @Override
    public Genre readById(int id) {
        return entityManager.find(Genre.class, id);
    }

    @Override
    public void update(Genre genre) {
        entityManager.merge(genre);
    }

    @Override
    public void deleteById(int id) {
        Genre genre = entityManager.find(Genre.class, id);
        if (genre != null) {
            entityManager.remove(genre);
        }
    }

    @Override
    public List<Genre> getAll() {
        return null;
    }
}
