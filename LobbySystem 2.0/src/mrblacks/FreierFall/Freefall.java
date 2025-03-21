package mrblacks.FreierFall;

/**
 * Created by Julian! on 25.07.2017.
 */
import mrblacks.Main.main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Freefall
        implements Listener
{
    private static main plugin = main.getPlugin();

    public Freefall(main plugin) {
        plugin = plugin;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e)
    {
        Player p = (Player)e.getWhoClicked();

        if ((e.getInventory().getName().equalsIgnoreCase("§dKosmetik")) &&
                (e.getCurrentItem().getType() == Material.ENDER_PEARL)) {
            World w = p.getWorld();

            if (w == null)
            {
                return;
            }

            double x = w.getSpawnLocation().getX();
            double y = w.getSpawnLocation().getY() + 120.0D;
            double z = w.getSpawnLocation().getZ();

            Location l = new Location(w, x, y, z);

            p.teleport(l);

            p.closeInventory();
        }
    }
}
