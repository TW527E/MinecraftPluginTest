package org.tw527e.tw527e;

import org.bukkit.plugin.java.JavaPlugin;
import org.tw527e.tw527e.commands.Hello;
import org.tw527e.tw527e.events.LeaveBed;

import static org.bukkit.Bukkit.getPluginManager;

public final class Tw527 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("測試插件已啟用!");
        getPluginManager().registerEvents(new LeaveBed(), this);
        getCommand("Hello").setExecutor(new Hello());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("測試插件已停用!");
    }
}
