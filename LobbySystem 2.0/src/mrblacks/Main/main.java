package mrblacks.Main;

import mrblacks.FreierFall.Freefall;
import mrblacks.blockDamage.BlockDamage;
import java.util.ArrayList;

import mrblacks.blockHunger.BlockHunger;
import mrblacks.einstellungen.einstellungen;
import mrblacks.eventBlock.BlockEvents;
import mrblacks.gameteleport.game;
import mrblacks.hide.Events;
import mrblacks.joinitems.JoinItems;
import mrblacks.navi.navigator;
import mrblacks.nospam.JoinSpam;
import mrblacks.nospam.quitSpam;
import mrblacks.particals.Interface;
import mrblacks.particals.Particals;
import mrblacks.trampolin.jump;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin
{
    public static ArrayList<Player> ender = new ArrayList();

    public static ArrayList<Player> fire = new ArrayList();

    public static ArrayList<Player> cloud = new ArrayList();

    public static ArrayList<Player> smoke = new ArrayList();
    private static main m;

    public static main getPlugin()
    {
        return m;
    }

    public void onEnable()
    {
        registerCommands();
        new Particals(this);
        new Interface(this);

        LoadConfig();

        m = this;

        Bukkit.getPluginManager().registerEvents(new Events(this), this);
        Bukkit.getPluginManager().registerEvents(new Freefall(this), this);
        Bukkit.getPluginManager().registerEvents(new jump(this), this);
        Bukkit.getPluginManager().registerEvents(new navigator(this), this);
        Bukkit.getPluginManager().registerEvents(new JoinItems(this), this);
        Bukkit.getPluginManager().registerEvents(new einstellungen(), this);
        Bukkit.getPluginManager().registerEvents(new BlockDamage(this), this);
        Bukkit.getPluginManager().registerEvents(new BlockEvents(), this);
        Bukkit.getPluginManager().registerEvents(new BlockHunger(this), this);
        Bukkit.getPluginManager().registerEvents(new game(), this);
        Bukkit.getPluginManager().registerEvents(new JoinSpam(this), this);
        Bukkit.getPluginManager().registerEvents(new quitSpam(this), this);
        Bukkit.getPluginManager().registerEvents(new Particals(this), this);
        Bukkit.getPluginManager().registerEvents(new Interface(this), this);
    }
    private void registerCommands() {
        getCommand("setgame1").setExecutor(new game());
        getCommand("setgame2").setExecutor(new game());
        getCommand("setgame3").setExecutor(new game());
        getCommand("setgame4").setExecutor(new game());
        getCommand("Game1").setExecutor(new game());
        getCommand("Game2").setExecutor(new game());
        getCommand("Game3").setExecutor(new game());
        getCommand("Game4").setExecutor(new game());
        getCommand("Setspawn").setExecutor(new game());
    }
    public void onDisable()
    {
    }

    public void LoadConfig()
    {
        getConfig().options().copyDefaults(true);

        saveConfig();
    }
}