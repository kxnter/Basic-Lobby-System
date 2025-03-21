package mrblacks.trampolin;

import mrblacks.Main.main;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class jump
        implements Listener
{
    private static main plugin = main.getPlugin();
    String toggle = plugin.getConfig().getString("Config.Trampolin.Toggle");

    public jump(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void on(PlayerMoveEvent e)
    {
        Player p = e.getPlayer();

        if (p.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.SPONGE)
        {
            if (this.toggle.equals("ein")) {
                Vector v = p.getLocation().getDirection().multiply(0.0D).setY(2.0D);
                p.setVelocity(v);

                p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 5);
                p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1.0F, 1.0F);

                p.setFallDistance(-999.0F);
            }
        }
    }
}
