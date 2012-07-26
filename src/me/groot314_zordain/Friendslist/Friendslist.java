package me.groot314_zordain.Friendslist;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Friendslist extends JavaPlugin{
	
	private FriendslistExecutor friendslistExecutor;
	
	@Override
	public void onEnable() {
		friendslistExecutor = new FriendslistExecutor(this);
		getCommand("friendslist").setExecutor((CommandExecutor) friendslistExecutor);
		
		pluginInfo("Enabled");
	}
	
	@Override
	public void onDisable() {
		
		pluginInfo("Disabled");
	}
	
	public static void pluginInfo(String Message){
		System.out.println("Friends" + Message);
	}
}
