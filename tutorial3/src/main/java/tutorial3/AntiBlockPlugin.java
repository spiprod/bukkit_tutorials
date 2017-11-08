package tutorial3;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiBlockPlugin extends JavaPlugin {

	public Permission playerPermission = new Permission("playerAbilities.allowed");

	@Override
	public void onEnable() {
		getLogger().info("Hello Noah. Tutorial 3 BlockListener has been enabled");
		new BlockListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(playerPermission);
	}

	@Override
	public void onDisable() {

	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("givemeitems") && sender instanceof Player) {
			Player player = (Player) sender;

			if (player.hasPermission("playerAbilities.allowed")) {
				player.setItemInHand(new ItemStack(Material.DIAMOND_AXE));

				return true;

			}

		}
		return true;
	}
}
