package me.firstflames;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	public PlayerListener(EventHandle plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onThrow(PlayerEggThrowEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.RED + "DO NOT THROW EGGS!");
	}

	@EventHandler
	public void onBucketFill(PlayerBucketFillEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onHallo(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.GREEN + "Hallo " + player.getName() + ". Viel Saﬂ auf meinem Server");
	}
}
