package me.groot314_zordain.Friendslist;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class FriendslistExecutor implements CommandExecutor {

	private Friendslist plugin;

	public FriendslistExecutor(Friendslist plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("friendslist")){
			Bukkit.getServer().broadcastMessage("FriendsList----------");
		}
		return false;
	}

	
}
