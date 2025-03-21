package mrblacks.navi;

import mrblacks.Main.main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
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

public class navigator
        implements Listener
{
    private static main plugin = main.getPlugin();
    String GT = getPlugin().getConfig().getString("Config.Navigator.Gametypes");

    ItemStack spiel1 = new ItemStack(Material.getMaterial(getPlugin().getConfig().getString("Config.Navigator.Game1.Item")));

    String G1N = getPlugin().getConfig().getString("Config.Navigator.Game1.GameName");

    String G1C = getPlugin().getConfig().getString("Config.Navigator.Game1.CMDTT");

    ItemStack spiel2 = new ItemStack(Material.getMaterial(getPlugin().getConfig().getString("Config.Navigator.Game2.Item")));

    String G2N = getPlugin().getConfig().getString("Config.Navigator.Game2.GameName");

    String G2C = getPlugin().getConfig().getString("Config.Navigator.Game2.CMDTT");

    ItemStack spiel3 = new ItemStack(Material.getMaterial(getPlugin().getConfig().getString("Config.Navigator.Game3.Item")));

    String G3N = getPlugin().getConfig().getString("Config.Navigator.Game3.GameName");

    String G3C = getPlugin().getConfig().getString("Config.Navigator.Game3.CMDTT");

    ItemStack spiel4 = new ItemStack(Material.getMaterial(getPlugin().getConfig().getString("Config.Navigator.Game4.Item")));

    String G4N = getPlugin().getConfig().getString("Config.Navigator.Game4.GameName");

    String G4C = getPlugin().getConfig().getString("Config.Navigator.Game4.CMDTT");

    String navi = plugin.getConfig().getString("Config.JoinItems.Navigator.name");

    Inventory inv = Bukkit.createInventory(null, InventoryType.BREWING, "§bNavigator");

    public navigator(main plugin)
    {
        setPlugin(plugin);
    }

    @EventHandler
    public void on(PlayerInteractEvent e)
    {
        Player p = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK))
            try {
                p.playSound(p.getLocation(), Sound.NOTE_BASS_GUITAR, 10, 10);
                if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.navi)))
                {
                    if (this.GT.equals("eins")) {
                        ItemStack nichts = new ItemStack(Material.EGG);
                        ItemMeta nichtsmeta = nichts.getItemMeta();
                        nichtsmeta.setDisplayName("§b[]");
                        nichts.setItemMeta(nichtsmeta);

                        ItemMeta spiel1meta = this.spiel1.getItemMeta();
                        spiel1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G1N));
                        this.spiel1.setItemMeta(spiel1meta);

                        this.inv.setItem(0, nichts);
                        this.inv.setItem(1, this.spiel1);
                        this.inv.setItem(2, nichts);
                        this.inv.setItem(3, nichts);
                    }
                    else if (this.GT.equals("zwei"))
                    {
                        ItemStack nichts = new ItemStack(Material.EGG);
                        ItemMeta nichtsmeta = nichts.getItemMeta();
                        nichtsmeta.setDisplayName("§b[]");
                        nichts.setItemMeta(nichtsmeta);

                        ItemMeta spiel1meta = this.spiel1.getItemMeta();
                        spiel1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G1N));
                        this.spiel1.setItemMeta(spiel1meta);

                        ItemMeta spiel2meta = this.spiel2.getItemMeta();
                        spiel2meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G2N));
                        this.spiel2.setItemMeta(spiel2meta);

                        this.inv.setItem(0, nichts);
                        this.inv.setItem(1, this.spiel1);
                        this.inv.setItem(2, nichts);
                        this.inv.setItem(3, this.spiel2);
                    }
                    else if (this.GT.equals("drei"))
                    {
                        ItemStack nichts = new ItemStack(Material.EGG);
                        ItemMeta nichtsmeta = nichts.getItemMeta();
                        nichtsmeta.setDisplayName("§b[]");
                        nichts.setItemMeta(nichtsmeta);

                        ItemMeta spiel1meta = this.spiel1.getItemMeta();
                        spiel1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G1N));
                         this.spiel1.setItemMeta(spiel1meta);

                        ItemMeta spiel2meta = this.spiel2.getItemMeta();
                        spiel2meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G2N));
                        this.spiel2.setItemMeta(spiel2meta);

                        ItemMeta spiel3meta = this.spiel3.getItemMeta();
                        spiel3meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G3N));
                        this.spiel3.setItemMeta(spiel3meta);

                        this.inv.setItem(0, this.spiel1);
                        this.inv.setItem(1, this.spiel2);
                        this.inv.setItem(2, this.spiel3);
                        this.inv.setItem(3, nichts);
                    }
                    else if (this.GT.equals("vier"))
                    {
                        ItemStack nichts = new ItemStack(Material.EGG);
                        ItemMeta nichtsmeta = nichts.getItemMeta();
                        nichtsmeta.setDisplayName("§b[]");
                        nichts.setItemMeta(nichtsmeta);

                        ItemMeta spiel1meta = this.spiel1.getItemMeta();
                        spiel1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G1N));
                        this.spiel1.setItemMeta(spiel1meta);

                        ItemMeta spiel2meta = this.spiel2.getItemMeta();
                        spiel2meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G2N));
                        this.spiel2.setItemMeta(spiel2meta);

                        ItemMeta spiel3meta = this.spiel3.getItemMeta();
                        spiel3meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G3N));
                        this.spiel3.setItemMeta(spiel3meta);

                        ItemMeta spiel4meta = this.spiel4.getItemMeta();
                        spiel4meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.G4N));
                        this.spiel4.setItemMeta(spiel4meta);

                        this.inv.setItem(0, this.spiel1);
                        this.inv.setItem(1, this.spiel2);
                        this.inv.setItem(2, this.spiel3);
                        this.inv.setItem(3, this.spiel4);
                    }

                    p.openInventory(this.inv);
                }
            }
            catch (Exception localException)
            {
            }
    }

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {
        Player p = (Player)event.getWhoClicked();
        if (p.getGameMode() == GameMode.CREATIVE){
            event.setCancelled(false);
         }else {
            event.setCancelled(true);
        }
        if (event.getView().getTopInventory().equals(this.inv))
        {
            System.out.println(event.getSlotType());
            if (((event.getSlotType() == InventoryType.SlotType.FUEL) || (event.getSlotType() == InventoryType.SlotType.CRAFTING)) && (event.getCurrentItem() != null) && (event.getCurrentItem().getType() != Material.AIR))
            {
                if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', this.G1N))) {
                    p.performCommand(this.G1C);
                    event.getWhoClicked().closeInventory();
                }if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', this.G2N))) {
                p.performCommand(this.G2C);
                event.getWhoClicked().closeInventory();
            }if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', this.G3N))) {
                p.performCommand(this.G3C);
                event.getWhoClicked().closeInventory();
            }if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', this.G4N))) {
                p.performCommand(this.G4C);
                event.getWhoClicked().closeInventory();
            }
            }
        }
    }

    public static main getPlugin()
    {
        return plugin;
    }

    public static void setPlugin(main plugin)
    {
        plugin = plugin;
    }
}
