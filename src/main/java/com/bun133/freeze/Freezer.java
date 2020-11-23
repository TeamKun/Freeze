package com.bun133.freeze;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Freezer implements Listener {
    private boolean isFreezing=false;
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        if(isFreezing){
            if(e.getPlayer().getGameMode()== GameMode.SURVIVAL){
                if(isMoved(e)) e.setCancelled(true);
            }
        }
    }

    private boolean isMoved(PlayerMoveEvent e) {
        Location from=e.getFrom();
        Location to=e.getTo();
//        int fromYPos = from.getBlockY();
        int fromZPos = from.getBlockZ();
//        int toYPos = to.getBlockY();
        int toZPos = to.getBlockZ();
        return !(/*fromYPos==toYPos &&*/ fromZPos==toZPos);
    }

    public void start(){
        Bukkit.broadcastMessage("Freeze Start!");
        isFreezing=true;
    }

    public void end(){
        Bukkit.broadcastMessage("Freeze End!");
        isFreezing=false;
    }
}
