package org.tw527e.tw527e.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!sender.isOp()) {
            sender.sendMessage("你沒有權限執行此指令!");
            return true;
        }
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Hello, " + player.getName() + "!");
            return true;
        }
        if (sender instanceof ConsoleCommandSender) {
            ConsoleCommandSender consoleCommandSender = (ConsoleCommandSender) sender;
            consoleCommandSender.sendMessage("Hello, Console!");
            return true;
        }
        return false;
    }
}
