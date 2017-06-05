package com.netcracker.istimaldar.library.service.commands.implimentation;

import com.netcracker.istimaldar.library.dao.GenericDAO;

import java.util.List;
import java.util.Properties;

/**
 * Created by istimaldar
 */
public class GetAllCommand<T> {

    GenericDAO<T> dao;

    public List<T> run(Properties params) {
        return dao.getAll();
    }
}
