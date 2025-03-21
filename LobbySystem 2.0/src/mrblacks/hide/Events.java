package mrblacks.hide;

import java.util.ArrayList;
import mrblacks.Main.main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events
        implements Listener
{
    private static main plugin = main.getPlugin();

    String msgHide = plugin.getConfig().getString("Config.PlayerHide.MessageOnHide");

    String msgShow = plugin.getConfig().getString("Config.PlayerHide.MessageOnShow");

    String msgHide2 = plugin.getConfig().getString("Config.SilentHub.MessageOnHide");

    String msgShow2 = plugin.getConfig().getString("Config.SilentHub.MessageOnShow");

    ArrayList<String> HideShow = new ArrayList();

    public Events(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        if (player.getItemInHand().getType() == Material.BLAZE_ROD) {
            if (this.HideShow.contains(player.getName())) {
                this.HideShow.remove(player.getName());
                for (Player players : Bukkit.getOnlinePlayers()) {
                    player.showPlayer(players);
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.msgShow));
            } else {
                this.HideShow.add(player.getName());
                for (Player players : Bukkit.getOnlinePlayers()) {
                    player.hidePlayer(players);
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.msgHide));
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        for (Player players : Bukkit.getOnlinePlayers())
            if (this.HideShow.contains(players.getName()))
                players.hidePlayer(player);
    }
}