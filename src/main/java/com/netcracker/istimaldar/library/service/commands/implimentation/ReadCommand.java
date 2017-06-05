package com.netcracker.istimaldar.library.service.commands.implimentation;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.service.commands.Command;

import java.util.Properties;

/**
 * Created by istimaldar
 */
public class ReadCommand<T> implements Command<T> {

    protected GenericDAO<T> dao;

    @Override
    public T run(Properties params) {
        return dao.readById(Integer.parseInt((String)params.getProperty("id")));
    }
}
