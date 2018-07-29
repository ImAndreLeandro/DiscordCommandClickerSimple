package net.imandreleandro.discordcmdsimple;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main main;
	
	public static Main instance;
	
	public Main() {
		instance = this;
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public void onEnable() {
		main = this;
		
		getCommand("discord").setExecutor(new cmdDiscord());
		
	}
	
	public void onDisable() {
		
	}
	
}
