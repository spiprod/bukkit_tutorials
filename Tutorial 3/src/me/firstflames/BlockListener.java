package me.firstflames;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
	public BlockListener(AntiBlock plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		Player player = e.getPlayer();

		if (!player.hasPermission("playerAbilities.allowed")) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.AQUA + "Du hast keine Berechtigung! Bitte kontaktiere den Serveradministrator, wenn du glaubst, dies ist ein Fehler.");
		}
	}

	@EventHandler
	public void onBlockBreake(BlockBreakEvent e) {
		Player player = e.getPlayer();

		if (!player.hasPermission("playerAbilities.allowed")) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.AQUA + "Du hast keine Berechtigung! Bitte kontaktiere den Serveradministrator, wenn du glaubst, dies ist ein Fehler.");
		}
	}
}