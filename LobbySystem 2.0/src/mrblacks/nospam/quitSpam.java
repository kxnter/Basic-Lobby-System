package mrblacks.nospam;

import mrblacks.Main.main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import sun.plugin2.main.server.Plugin;

/**
 * Created by Julian! on 25.07.2017.
 */
public class quitSpam implements Listener
{
    public static Plugin plugin;

    public quitSpam(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e)
    {
        e.setQuitMessage(null);
    }
}