package com.netcracker.istimaldar.library.service.factory;

import com.netcracker.istimaldar.library.service.commands.implimentation.*;
import com.netcracker.istimaldar.library.service.commands.implimentation.Librarian.AddBookCommand;

import java.util.Map;

/**
 * Created by istimaldar
 */
public class CommandFactory {
    private Map<String, Class> createCommandMap;
    private Map<String, Class> readCommandMap;
    private Map<String, Class> updateCommandMap;
    private Map<String, Class> deleteCommandMap;
    private Map<String, Class> getAllCommandMap;

    private CommandFactory() {
        readCommandMap.put("Book", AddBookCommand.class);
    }

    private static class CommandFactorySingletonHolder {
        static final CommandFactory INSTANCE = new CommandFactory();
    }

    public static CommandFactory getInstance() {
        return CommandFactorySingletonHolder.INSTANCE;
    }

    public CreateCommand getCreateCommand(String name) {
        CreateCommand result = null;
        try {
             result = (CreateCommand) createCommandMap.get(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ReadCommand getReadCommand(String name) {
        ReadCommand result = null;
        try {
            result = (ReadCommand) readCommandMap.get(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public UpdateCommand getUpdateCommand(String name) {
        return null;
    }

    public DeleteCommand getDeleteCommand(String name) {
        return null;
    }

    public GetAllCommand getGetAllCommand(String name) {
        return null;
    }
}
