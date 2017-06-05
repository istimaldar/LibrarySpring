package com.netcracker.istimaldar.library.service.commands;

import java.util.Properties;

/**
 * Created by istimaldar
 */
public interface Command<T> {
    T run(Properties params);
}
