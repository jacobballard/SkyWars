package vc.pvp.skywars.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import vc.pvp.skywars.SkyWars;
import vc.pvp.skywars.controllers.ChestController;
import vc.pvp.skywars.controllers.KitController;

@CommandDescription("Reloads the chests, kits and the plugin.yml")
@CommandPermissions("skywars.command.reload")
public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ChestController.get().load();
        KitController.get().load();
        SkyWars.get().reloadConfig();

        sender.sendMessage("\247aChests, kits and plugin.yml has been reloaded!");
        return true;
    }
}
