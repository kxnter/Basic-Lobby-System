package mrblacks.blockDamage;

import mrblacks.Main.main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;

public class BlockDamage
        implements Listener
{
    public static Plugin plugin;

    public BlockDamage(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e)
    {
            e.setCancelled(true);
    }
}
