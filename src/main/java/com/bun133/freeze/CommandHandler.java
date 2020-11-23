package com.bun133.freeze;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args[0]){
            case "start":
                return new StartCommand().onCommand(sender, command, label, args);
            case "stop":
                return new StopCommand().onCommand(sender, command, label, args);
            default:
                return false;
        }
    }
}
