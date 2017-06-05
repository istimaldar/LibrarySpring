package com.netcracker.istimaldar.library.dao;

import java.util.List;

/**
 * Created by istimaldar
 */
public interface GenericDAO<T> {
    void create(T object);
    T readById(int id);
    void update(T object);
    void deleteById(int id);
    List<T> getAll();
}
