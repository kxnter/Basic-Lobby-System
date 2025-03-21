package mrblacks.particals;

/**
 * Created by Julian! on 25.07.2017.
 */
import mrblacks.Main.main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Interface
        implements Listener
{
    private static main plugin = main.getPlugin();

    public Interface(main plugin) {
        plugin = plugin;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e)
    {
        Player p = (Player)e.getWhoClicked();

        if ((e.getInventory().getName().equalsIgnoreCase("§dKosmetik")) &&
                (e.getCurrentItem().getType() == Material.REDSTONE))
        {
            Inventory inv = Bukkit.createInventory(null, 27, "Partikel");

            ItemStack is = new ItemStack(Material.EYE_OF_ENDER);
            ItemMeta im = is.getItemMeta();
            im.setDisplayName("§dEnder!");
            is.setItemMeta(im);

            ItemStack is5 = new ItemStack(Material.STAINED_GLASS_PANE);
            ItemMeta im5 = is.getItemMeta();
            im5.setDisplayName("§c==");
            is5.setItemMeta(im5);

            ItemStack is2 = new ItemStack(Material.FLINT_AND_STEEL);
            ItemMeta im2 = is2.getItemMeta();
            im2.setDisplayName("§cFire");
            is2.setItemMeta(im2);

            ItemStack is3 = new ItemStack(Material.FIREWORK_CHARGE);
            ItemMeta im3 = is3.getItemMeta();
            im3.setDisplayName("§7Somke");
            is3.setItemMeta(im3);

            ItemStack is4 = new ItemStack(Material.STAINED_GLASS);
            ItemMeta im4 = is4.getItemMeta();
            im4.setDisplayName("§dCloud");
            is4.setItemMeta(im4);

            ItemStack no = new ItemStack(Material.BARRIER);
            ItemMeta nom = no.getItemMeta();
            nom.setDisplayName("§cRemove");
            no.setItemMeta(nom);
            no.setItemMeta(nom);

            inv.setItem(0, is5);
            inv.setItem(1, is5);
            inv.setItem(2, is5);
            inv.setItem(3, is5);
            inv.setItem(4, is5);
            inv.setItem(5, is5);
            inv.setItem(6, is5);
            inv.setItem(7, is5);
            inv.setItem(8, is5);
            inv.setItem(9, is5);
            inv.setItem(17, is5);
            inv.setItem(18, is5);
            inv.setItem(19, is5);
            inv.setItem(20, is5);
            inv.setItem(21, is5);
            inv.setItem(22, is5);
            inv.setItem(23, is5);
            inv.setItem(24, is5);
            inv.setItem(25, is5);

            inv.setItem(10, is);
            inv.setItem(12, is2);
            inv.setItem(14, is3);
            inv.setItem(16, is4);
            inv.setItem(26, no);

            p.closeInventory();
            p.openInventory(inv);
        }

        if (e.getInventory().getName().equals("Partikel"))
        {
            if (e.getCurrentItem().getType() == Material.EYE_OF_ENDER)
            {
                p.closeInventory();

                main.ender.add(p);
                main.fire.remove(p);
                main.smoke.remove(p);
                main.cloud.remove(p);
                return;
            }
            if (e.getCurrentItem().getType() == Material.FLINT_AND_STEEL)
            {
                p.closeInventory();

                main.ender.remove(p);
                main.fire.add(p);
                main.smoke.remove(p);
                main.cloud.remove(p);
                return;
            }
            if (e.getCurrentItem().getType() == Material.FIREWORK_CHARGE)
            {
                p.closeInventory();

                main.ender.remove(p);
                main.fire.remove(p);
                main.smoke.add(p);
                main.cloud.remove(p);
                return;
            }
            if (e.getCurrentItem().getType() == Material.BARRIER)
            {
                p.closeInventory();

                main.ender.remove(p);
                main.fire.remove(p);
                main.smoke.remove(p);
                main.cloud.remove(p);
                return;
            }
            if (e.getCurrentItem().getType() == Material.STAINED_GLASS) {
                p.closeInventory();

                main.ender.remove(p);
                main.fire.remove(p);
                main.smoke.remove(p);
                main.cloud.add(p);
                return;
            }
        }
    }
}
