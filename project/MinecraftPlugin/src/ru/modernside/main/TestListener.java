package ru.modernside.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class TestListener implements Listener{
	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent event) {
		event.setCancelled(true);
	} 
}
