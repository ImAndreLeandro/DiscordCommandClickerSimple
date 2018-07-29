package net.imandreleandro.discordcmdsimple;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class cmdDiscord implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (cmd.getName().equalsIgnoreCase("discord") && sender instanceof Player) {
			Player p = (Player) sender;
			
			String a = Main.getInstance().getConfig().getString("Message");
			String b = Main.getInstance().getConfig().getString("Url_Message");
			String c = Main.getInstance().getConfig().getString("Url");
			
			TextComponent msg = new TextComponent(a);
			msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(b).create()));
			msg.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, c));
			
			p.spigot().sendMessage(msg);
			
		}
		return false;
	}
	
}
