package mrblacks.einstellungen;

import mrblacks.Main.main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class einstellungen
        implements Listener
{
    private static main plugin = main.getPlugin();

    Inventory inv = Bukkit.createInventory(null, InventoryType.BREWING, "§dKosmetik");


    @EventHandler
    public void on(PlayerInteractEvent e)
    {
        Player p = e.getPlayer();

        e.setCancelled(true);

        if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK))
            try {
                if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dKosmetik"))
                {
                    ItemStack nichts = new ItemStack(Material.EGG);
                    ItemMeta nichtsmeta = nichts.getItemMeta();
                    nichtsmeta.setDisplayName("§b[]");
                    nichts.setItemMeta(nichtsmeta);

                    ItemStack spiel1 = new ItemStack(Material.REDSTONE);
                    ItemMeta spiel1meta = spiel1.getItemMeta();
                    spiel1meta.setDisplayName("§cPartical");
                    spiel1.setItemMeta(spiel1meta);

                    ItemStack spiel2 = new ItemStack(Material.ENDER_PEARL);
                    ItemMeta spiel2meta = spiel2.getItemMeta();
                    spiel2meta.setDisplayName("§aSpezial: §eFree-Fall");
                    spiel2.setItemMeta(spiel2meta);

                    this.inv.setItem(0, nichts);
                    this.inv.setItem(1, spiel2);
                    this.inv.setItem(2, nichts);
                    this.inv.setItem(3, spiel1);

                    p.openInventory(this.inv);
                }
            }
            catch (Exception localException)
            {
            }
    }

    public void onInventoryClick(InventoryClickEvent event)
    {
        Player p = (Player)event.getWhoClicked();

        if (event.getView().getTopInventory().equals(this.inv))
            event.setCancelled(true);
    }
}
