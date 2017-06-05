package com.netcracker.istimaldar.library.service.commands.implimentation;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.service.commands.Command;

import java.util.Properties;

/**
 * Created by istimaldar
 */
public class DeleteCommand<T> implements Command<T> {

    GenericDAO<T> dao;

    @Override
    public T run(Properties params) {
        dao.deleteById(Integer.parseInt(params.getProperty("id")));
        return null;
    }
}
