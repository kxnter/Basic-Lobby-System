package mrblacks.joinitems;

import mrblacks.Main.main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinItems
        implements Listener
{
    public static main plugin = main.getPlugin();
    String off = "off";
    String toggle = plugin.getConfig().getString("Config.Eintellungen.toggle");

    String navi = plugin.getConfig().getString("Config.JoinItems.Navigator.name");
    String sh = plugin.getConfig().getString("Config.JoinItems.DiamondBlock.name");
    String pt = plugin.getConfig().getString("Config.JoinItems.PlayerToggle.name");

    public JoinItems(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();

        p.getInventory().clear();
        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.navi));
        item.setItemMeta(meta);

        p.getInventory().setItem(4, item);


        ItemStack item1 = new ItemStack(Material.BLAZE_ROD);
        ItemMeta meta1 = item1.getItemMeta();
        meta1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.pt));
        item1.setItemMeta(meta1);

        p.getInventory().setItem(2, item1);

        ItemStack item2 = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta2 = item2.getItemMeta();
        meta2.setDisplayName("§dKosmetik");
        item2.setItemMeta(meta2);
        p.getInventory().setItem(6, item2);

        ItemStack item3 = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta meta3 = item3.getItemMeta();
        item3.setItemMeta(meta3);

        p.getInventory().setItem(0, item3);

        ItemStack item4 = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta meta4 = item4.getItemMeta();
        item4.setItemMeta(meta4);

        p.getInventory().setItem(8, item4);
    }
}