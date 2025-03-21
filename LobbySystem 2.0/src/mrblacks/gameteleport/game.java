package mrblacks.gameteleport;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.io.File;
import java.io.IOException;

/**
 * Created by Julian! on 25.07.2017.
 */
public class game implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("setGame1")) {
            Player p = (Player)sender;
            if(!(p.hasPermission("lobby.set"))){
                return true;
            }
            File ordner = new File("plugins//LobbySystem");
            File file = new File("plugins//LobbySystem//Game1.yml");

            if(!ordner.exists()){
                ordner.mkdir();
            }

            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

            Location loc = p.getLocation();

            double x = loc.getX();
            double y = loc.getY();
            double z = loc.getZ();

            double yaw = loc.getYaw();
            double pitch = loc.getPitch();

            String weltname = loc.getWorld().getName();

            cfg.set("server.Spawn.X", x);
            cfg.set("server.Spawn.Y", y);
            cfg.set("server.Spawn.Z", z);

            cfg.set("server.Spawn.Yaw", yaw);
            cfg.set("server.Spawn.Pitch", pitch);

            cfg.set("server.Spawn.Weltname", weltname);
            p.sendMessage("§aGesetzt!");
            try {
                cfg.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (cmd.getName().equalsIgnoreCase("setGame2")) {
                Player p = (Player)sender;
                if(!(p.hasPermission("lobby.set"))){
                    return true;
                }
                File ordner = new File("plugins//LobbySystem");
                File file = new File("plugins//LobbySystem//Game2.yml");

                if(!ordner.exists()){
                    ordner.mkdir();
                }

                if(!file.exists()){
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

                Location loc = p.getLocation();

                double x = loc.getX();
                double y = loc.getY();
                double z = loc.getZ();

                double yaw = loc.getYaw();
                double pitch = loc.getPitch();

                String weltname = loc.getWorld().getName();

                cfg.set("server.Spawn.X", x);
                cfg.set("server.Spawn.Y", y);
                cfg.set("server.Spawn.Z", z);

                cfg.set("server.Spawn.Yaw", yaw);
                cfg.set("server.Spawn.Pitch", pitch);

                cfg.set("server.Spawn.Weltname", weltname);
                p.sendMessage("§aGesetzt!");
                try {
                    cfg.save(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                if (cmd.getName().equalsIgnoreCase("setGame3")) {
                    Player p = (Player)sender;
                    if(!(p.hasPermission("lobby.set"))){
                        return true;
                    }
                    File ordner = new File("plugins//LobbySystem");
                    File file = new File("plugins//LobbySystem//Game3.yml");

                    if(!ordner.exists()){
                        ordner.mkdir();
                    }

                    if(!file.exists()){
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

                    Location loc = p.getLocation();

                    double x = loc.getX();
                    double y = loc.getY();
                    double z = loc.getZ();

                    double yaw = loc.getYaw();
                    double pitch = loc.getPitch();

                    String weltname = loc.getWorld().getName();

                    cfg.set("server.Spawn.X", x);
                    cfg.set("server.Spawn.Y", y);
                    cfg.set("server.Spawn.Z", z);

                    cfg.set("server.Spawn.Yaw", yaw);
                    cfg.set("server.Spawn.Pitch", pitch);

                    cfg.set("server.Spawn.Weltname", weltname);
                    p.sendMessage("§aGesetzt!");
                    try {
                        cfg.save(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (cmd.getName().equalsIgnoreCase("setGame4")) {
                        Player p = (Player)sender;
                        if(!(p.hasPermission("lobby.set"))){
                            return true;
                        }
                        File ordner = new File("plugins//LobbySystem");
                        File file = new File("plugins//LobbySystem//Game4.yml");

                        if(!ordner.exists()){
                            ordner.mkdir();
                        }

                        if(!file.exists()){
                            try {
                                file.createNewFile();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

                        Location loc = p.getLocation();

                        double x = loc.getX();
                        double y = loc.getY();
                        double z = loc.getZ();

                        double yaw = loc.getYaw();
                        double pitch = loc.getPitch();

                        String weltname = loc.getWorld().getName();

                        cfg.set("server.Spawn.X", x);
                        cfg.set("server.Spawn.Y", y);
                        cfg.set("server.Spawn.Z", z);

                        cfg.set("server.Spawn.Yaw", yaw);
                        cfg.set("server.Spawn.Pitch", pitch);

                        cfg.set("server.Spawn.Weltname", weltname);
                        p.sendMessage("§aGesetzt!");
                        try {
                            cfg.save(file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (cmd.getName().equalsIgnoreCase("setspawn")) {
                            Player p = (Player)sender;
                            if(!(p.hasPermission("lobby.set"))){
                                return true;
                            }
                            File ordner = new File("plugins//LobbySystem");
                            File file = new File("plugins//LobbySystem//spawn.yml");

                            if(!ordner.exists()){
                                ordner.mkdir();
                            }

                            if(!file.exists()){
                                try {
                                    file.createNewFile();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

                            Location loc = p.getLocation();

                            double x = loc.getX();
                            double y = loc.getY();
                            double z = loc.getZ();

                            double yaw = loc.getYaw();
                            double pitch = loc.getPitch();

                            String weltname = loc.getWorld().getName();

                            cfg.set("server.Spawn.X", x);
                            cfg.set("server.Spawn.Y", y);
                            cfg.set("server.Spawn.Z", z);

                            cfg.set("server.Spawn.Yaw", yaw);
                            cfg.set("server.Spawn.Pitch", pitch);

                            cfg.set("server.Spawn.Weltname", weltname);
                            p.sendMessage("§aGesetzt!");
                            try {
                                cfg.save(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            if (cmd.getName().equalsIgnoreCase("Game1")) {
                                Player p = (Player)sender;
                                File file = new File("plugins//LobbySystem//Game1.yml");
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
                            } else {
                                if (cmd.getName().equalsIgnoreCase("Game2")) {
                                    Player p = (Player)sender;
                                    File file = new File("plugins//LobbySystem//Game2.yml");
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
                                } else {
                                    if (cmd.getName().equalsIgnoreCase("Game3")) {
                                        Player p = (Player)sender;
                                        File file = new File("plugins//LobbySystem//Game3.yml");
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
                                    } else {
                                        if (cmd.getName().equalsIgnoreCase("Game4")) {
                                            Player p = (Player)sender;
                                            File file = new File("plugins//LobbySystem//Game4.yml");
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}