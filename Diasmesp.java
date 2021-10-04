package vichii.diasmesp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import vichii.diasmesp.comandos.ComandoDiscord;


public class Diasmesp extends JavaPlugin{
	
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = ChatColor.YELLOW+"["+ChatColor.RED+pdffile.getName()+ChatColor.YELLOW+"]";
	
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.YELLOW+"By Vichii" +ChatColor.BLUE+" El plugin se ha activado "+ChatColor.WHITE +"(version:" +version+")");
		registrarComandos();
		
	}
	
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage(nombre +ChatColor.BLUE+" El plugin se ha desactivado "+ChatColor.WHITE +"(version:" +version+")");
		
	}
	
	public void registrarComandos() {
		this.getCommand("discord").setExecutor(new ComandoDiscord(this)); 
		
		
	}
	
}

