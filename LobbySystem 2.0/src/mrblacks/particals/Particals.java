package mrblacks.particals;

/**
 * Created by Julian! on 25.07.2017.
 */
import mrblacks.Main.main;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Particals
        implements Listener
{
    private static main plugin = main.getPlugin();

    public Particals(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e)
    {
        Player p = e.getPlayer();
        if (main.ender.contains(p))
        {
            p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1, 1);
            return;
        }
        if (main.fire.contains(p))
        {
            p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1, 1);
            return;
        }
        if (main.smoke.contains(p))
        {
            p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 50, 30);
            return;
        }
        if (main.cloud.contains(p))
        {
            p.getWorld().playEffect(p.getLocation(), Effect.CLOUD, 70, 50);
            return;
        }
    }
}