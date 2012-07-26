package me.groot314_zordain.Friendslist;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Friendslist extends JavaPlugin{
	
	private FriendslistExecutor friendslistExecutor;
	
	@Override
	public void onEnable() {
		friendslistExecutor = new FriendslistExecutor(this);
		getCommand("friendslist").setExecutor((CommandExecutor) friendslistExecutor);
	}
	
	@Override
	public void onDisable() {
		
	}
}
