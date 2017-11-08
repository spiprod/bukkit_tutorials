package tutorial4;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiBlockPlugin extends JavaPlugin {

	public Permission playerPermission = new Permission("playerAbilities.allowed");

	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. Tutorial 4 - BlockListener has been enabled");
		new BlockListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(playerPermission);
	}

	@Override
	public void onDisable() {

	}
}
