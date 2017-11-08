package tutorial2;

import org.bukkit.plugin.java.JavaPlugin;

public class EventPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. onEnable has been enabled");
		new PlayerListener(this);
	}

	@Override
	public void onDisable() {
	
	}

}
