package me.firstflames;

import org.bukkit.plugin.java.JavaPlugin;

public class EventHandle extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. onEnable has been enabled");
		new PlayerListener(this);
	}

	@Override
	public void onDisable() {
	
	}

}
