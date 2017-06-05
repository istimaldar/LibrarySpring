package com.netcracker.istimaldar.library.service.commands.implimentation.User;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Genre;
import com.netcracker.istimaldar.library.service.commands.implimentation.ReadCommand;

/**
 * Created by istimaldar
 */
public class ReadGenreCommand extends ReadCommand<Genre> {
    void setDAO(GenericDAO<Genre> dao) {
        this.dao = dao;
    }
}
