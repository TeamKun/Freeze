package com.bun133.freeze;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Freeze extends JavaPlugin {
    public static Freezer freezer=new Freezer();
    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("freeze").setExecutor(new CommandHandler());
//        getCommand("start").setExecutor(new StartCommand());
//        getCommand("stop").setExecutor(new StopCommand());
        Bukkit.getServer().getPluginManager().registerEvents(freezer,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
