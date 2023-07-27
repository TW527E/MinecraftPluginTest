package org.tw527e.tw527e.events;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class LeaveBed implements Listener {
    @EventHandler
    public void onLeaveBed(org.bukkit.event.player.PlayerBedLeaveEvent event) {
        event.getPlayer().sendMessage(ChatColor.GOLD + "你離開了床");
    }
}
