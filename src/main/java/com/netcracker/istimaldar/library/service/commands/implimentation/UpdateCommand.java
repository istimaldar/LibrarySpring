package com.netcracker.istimaldar.library.service.commands.implimentation;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.service.commands.Command;

/**
 * Created by istimaldar
 */
public abstract class UpdateCommand<T> implements Command {
    private GenericDAO<T> dao;
}
