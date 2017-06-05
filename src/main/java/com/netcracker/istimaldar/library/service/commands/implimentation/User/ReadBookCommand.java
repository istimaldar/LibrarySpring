package com.netcracker.istimaldar.library.service.commands.implimentation.User;

import com.netcracker.istimaldar.library.dao.GenericDAO;
import com.netcracker.istimaldar.library.entity.Book;
import com.netcracker.istimaldar.library.service.commands.implimentation.ReadCommand;

/**
 * Created by istimaldar
 */
public class ReadBookCommand extends ReadCommand<Book> {
    void setDAO(GenericDAO<Book> dao) {
        this.dao = dao;
    }
}
