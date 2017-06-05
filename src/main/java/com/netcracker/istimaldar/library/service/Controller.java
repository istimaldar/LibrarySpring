package com.netcracker.istimaldar.library.service;

import com.netcracker.istimaldar.library.service.commands.implimentation.ReadCommand;
import com.netcracker.istimaldar.library.service.factory.CommandFactory;
import org.apache.maven.model.Model;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Properties;

/**
 * Created by istimaldar
 */
@Service
public class Controller {

    @GetMapping("/add/{entity}")
    public String read(@PathVariable String entity, @RequestParam String id,  Model model) {
        ReadCommand command = CommandFactory.getInstance().getReadCommand(entity);
        Properties properties = new Properties();
        properties.put("id", id);
        command.run(properties);
        return "displayOwner";
    }
}
