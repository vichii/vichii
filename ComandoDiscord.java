package vichii.diasmesp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import vichii.diasmesp.Diasmesp;


public class ComandoDiscord implements CommandExecutor{
	
	private Diasmesp plugin;
	
	public ComandoDiscord(Diasmesp plugin) {
		this.plugin = plugin;
			}
	
	public boolean onCommand(CommandSender sender, Command discord, String label, String[] args) {
	
		if (!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(plugin.nombre +" No puedes ejecutar comandos de este plugin desde consola");
			return false;
		}
		else {
			
			Player jugador = (Player) sender;
			jugador.sendMessage(ChatColor.YELLOW+"--------------------------------");
			jugador.sendMessage(ChatColor.RED+"ÚNETE A NUESTRO DISCORD: https://discord.gg/ByCQj2C");
			jugador.sendMessage(ChatColor.YELLOW+"--------------------------------");
			return true;
		}
	}
	
	

}
