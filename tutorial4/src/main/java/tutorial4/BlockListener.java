package tutorial4;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
	private static final String PLAYER_ABILITIES_ALLOWED = "playerAbilities.allowed";
	
	public BlockListener(AntiBlockPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		Player player = e.getPlayer();

		if (e.getBlock().getType() == Material.BEDROCK) {
			if (!player.hasPermission(PLAYER_ABILITIES_ALLOWED)) {
				e.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You cannot place " + e.getBlock().getType().toString() + " down!");
			} else {
				player.sendMessage(ChatColor.GREEN + "You can place " + e.getBlock().getType().toString() + " down!");
			}
		}
		
		if (e.getBlock().getType() == Material.GLOWSTONE) {
			
			Location location = e.getBlock().getLocation();
			
			if (new Location(location.getWorld(), location.getX(), location.getY() - 1, location.getZ()).getBlock().getType() == Material.GRASS) { 
				player.sendMessage(ChatColor.GREEN + "You can place " + e.getBlock().getType().toString() + " down!");	
			}else {
				e.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You cannot place " + e.getBlock().getType().toString() + " down!");
			}
			
		}
		
	}

	@EventHandler
	public void onBlockBreake(BlockBreakEvent e) {
		Player player = e.getPlayer();

		if (!player.hasPermission(PLAYER_ABILITIES_ALLOWED)) {
			e.setCancelled(true);

		}
	}
}
