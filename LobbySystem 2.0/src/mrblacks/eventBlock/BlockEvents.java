package mrblacks.eventBlock;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.plugin.Plugin;

public class BlockEvents implements Listener {
    public static Plugin plugin;

    @EventHandler
    public void onDropItem(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.CREATIVE) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e) {
        e.setCancelled(true);
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.CREATIVE){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.CREATIVE) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onFire(BlockBurnEvent e)
    {
        e.setCancelled(true);
    }
    @EventHandler
    public void onPickUpItems(PlayerPickupItemEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.CREATIVE) {
            e.setCancelled(true);
        }
    }
}