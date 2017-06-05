package com.netcracker.istimaldar.library.service.commands.implimentation;

import com.netcracker.istimaldar.library.service.commands.Command;

import java.util.Properties;

/**
 * Created by istimaldar
 */
public class NoActionCommand implements Command{
    @Override
    public String run(Properties params) {
        return "";
    }
}
