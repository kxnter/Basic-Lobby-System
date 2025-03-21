package mrblacks.blockHunger;

import mrblacks.Main.main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.Plugin;

public class BlockHunger
        implements Listener
{
    public static Plugin plugin;

    public BlockHunger(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onLoseHunger(FoodLevelChangeEvent e)
    {
            e.setCancelled(true);
    }
}