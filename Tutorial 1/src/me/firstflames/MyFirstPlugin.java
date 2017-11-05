package me.firstflames;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. onEnable has been enabled");
	}

	@Override
	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("hello") && sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("Hello, " + player.getName() + "!");
			return true;
		}
		return false;
	}

}
