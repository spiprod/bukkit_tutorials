package me.firstflames;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiBlock2 extends JavaPlugin {

	public Permission playerPermission = new Permission("playerAbilities.allowed");

	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. BlockListener has been enabled");
		new BlockListener2(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(playerPermission);
	}

	@Override
	public void onDisable() {

	}
}
