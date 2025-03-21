package mrblacks.nospam;

import mrblacks.Main.main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.util.Vector;
import sun.plugin2.main.server.Plugin;

import java.io.File;

/**
 * Created by Julian! on 25.07.2017.
 */
public class JoinSpam implements Listener
{
    public static Plugin plugin;

    public JoinSpam(main plugin)
    {
        plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();
        p.setHealth(20);
        p.setFoodLevel(20);
        p.setLevel(2017);
        e.setJoinMessage(null);
        File file = new File("plugins//LobbySystem//spawn.yml");
        if(!file.exists()){
        }
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        Location loc = p.getLocation();
        loc.setX(cfg.getDouble("server.Spawn.X"));
        loc.setY(cfg.getDouble("server.Spawn.Y"));
        loc.setZ(cfg.getDouble("server.Spawn.Z"));
        double yaw = cfg.getDouble("server.Spawn.Yaw");
        double pitch = cfg.getDouble("server.Spawn.Pitch");
        loc.setYaw((float) yaw);
        loc.setPitch((float) pitch);
        World welt = Bukkit.getWorld(cfg.getString("server.Spawn.Weltname"));
        loc.setWorld(welt);
        p.teleport(loc);
        p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);
        p.sendTitle("§7Herzlich Willkommen!" , p.getName());
        Vector v = p.getLocation().getDirection().multiply(0.0D).setY(0.7);
        p.setVelocity(v);
    }
}
