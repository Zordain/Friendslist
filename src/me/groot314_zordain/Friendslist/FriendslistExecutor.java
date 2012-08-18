package me.groot314_zordain.Friendslist;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class FriendslistExecutor implements CommandExecutor {

	@SuppressWarnings("unused")
	private Friendslist plugin;

	public FriendslistExecutor(Friendslist plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("friendslist")){
			Bukkit.getServer().broadcastMessage("FriendsList----------");
			Bukkit.getServer().broadcastMessage("/FL Help - To See this");
			Bukkit.getServer().broadcastMessage("/FL friends - to see Friends list");
			Bukkit.getServer().broadcastMessage("/FL add - to add friends");
			return true;
		}
		return false;
	}

	
}
