package com.netcracker.istimaldar.library.impl;

import com.netcracker.istimaldar.library.dao.GenreDAO;
import com.netcracker.istimaldar.library.entity.Genre;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public class GenreDAOImpl implements GenreDAO {

    @PersistenceContext(unitName = "library")
    private EntityManager entityManager;

    private GenreDAOImpl() {

    }

    private static class GenreSingletonHolder {
        static final GenreDAOImpl INSTANCE = new GenreDAOImpl();
    }

    public static GenreDAO getInstance() {
        return GenreSingletonHolder.INSTANCE;
    }

    @Override
    public void createGenre(Genre genre) throws SQLException {
        entityManager.persist(genre);
    }

    @Override
    public Genre readGenreById(int id) {
        return entityManager.find(Genre.class, id);
    }

    @Override
    public void updateGenre(Genre genre) {
        entityManager.merge(genre);
    }

    @Override
    public void deleteGenreById(int id) {
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
