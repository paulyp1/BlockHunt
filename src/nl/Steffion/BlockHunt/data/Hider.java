package nl.Steffion.BlockHunt.data;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import nl.Steffion.BlockHunt.BlockHunt;

public class Hider {
	private Material	block;
	private UUID		player;
	private BlockHunt	plugin;
	private int			solidBlockTimer;

	public Hider(Player player) {
		plugin = BlockHunt.getPlugin();
		
		this.player = player.getUniqueId();
	}

	public Material getBlock() {
		return block;
	}
	
	public Player getPlayer() {
		return plugin.getServer().getPlayer(player);
	}
	
	public int getSolidBlockTimer() {
		return solidBlockTimer;
	}
	
	public void setBlock(Material block) {
		this.block = block;
	}
	
	public void setPlayer(Player player) {
		this.player = player.getUniqueId();
	}
	
	public void setSolidBlockTimer(int solidBlockTimer) {
		this.solidBlockTimer = solidBlockTimer;
	}
	
}