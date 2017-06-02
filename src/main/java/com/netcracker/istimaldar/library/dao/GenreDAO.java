package com.netcracker.istimaldar.library.dao;

import com.netcracker.istimaldar.library.entity.Genre;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by istimaldar
 */
public interface GenreDAO {
    int createGenre(Genre genre) throws SQLException;
    Genre readGenreById(int id);
    boolean updateGenre(Genre genre);
    void deleteGenreById(int id);
    List<Genre> getAll();
}
