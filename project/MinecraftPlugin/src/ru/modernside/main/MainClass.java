package ru.modernside.main;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	
	Logger log = this.getServer().getLogger();
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new TestListener(), this);
		
		log.info("Plugin v1.0 loaded!");
	}
	
	
	@Override
	public void onDisable() {
		log.info("Plugin v1.0 disabled!");
	}
	
	
	
}
