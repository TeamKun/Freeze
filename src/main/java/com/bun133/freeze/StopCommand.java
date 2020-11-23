package com.bun133.freeze;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player=((Player)sender);
            if(player.isOp()){
                onStop();
                return true;
            }else{
                sender.sendMessage("You don't have enough permission");
                return true;
            }
        }else{
            onStop();
            return true;
        }
    }

    public void onStop(){
        Freeze.freezer.end();
    }
}
