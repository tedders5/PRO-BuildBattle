package me.drawe.spectateapi;

import lombok.Getter;
import me.drawe.buildbattle.utils.compatbridge.model.CompMaterial;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class SpectatorManager implements Listener {

    private final JavaPlugin plugin;
    @Getter
    private final HashMap<Player, Spectatable> spectators;
    private final HashMap<Player, SpectatePlayerData> playerData;

    public SpectatorManager(JavaPlugin plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.spectators = new HashMap<>();
        this.playerData = new HashMap<>();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDamage(EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }
        Player p = (Player) e.getEntity();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDamage2(EntityDamageByEntityEvent e) {

        if (!(e.getDamager() instanceof Player)) {
            return;
        }

        Player p = (Player) e.getDamager();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerPickup(PlayerPickupItemEvent e) {
        Player p = e.getPlayer();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onHunger(FoodLevelChangeEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }

        Player p = (Player) e.getEntity();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDropItem(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        this.handleEvent(e, p);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInterract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (this.spectators.containsKey(p) && e.getItem() != null) {
            e.setCancelled(true);
            if (e.getItem().isSimilar(Spectatable.SPECTATE_ITEM)) {
                this.openSpectateInventory(p);
            } else if (e.getItem().isSimilar(Spectatable.QUIT_SPECTATE_ITEM)) {
                this.unspectate(p);
            }
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if(this.spectators.containsKey(e.getPlayer())) {
            this.unspectate(e.getPlayer());
        }
    }

    private void openSpectateInventory(Player p) {
        p.openInventory(this.spectators.get(p).getSpectateInventory());
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (this.spectators.containsKey(p)) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null && e.getCurrentItem().getType() == CompMaterial.PLAYER_HEAD.getMaterial()) {
                p.teleport(Bukkit.getPlayer(e.getCurrentItem().getItemMeta().getDisplayName()).getLocation());
            }
        }
    }

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent e) {
        Player p = e.getPlayer();

        if(this.spectators.containsKey(p)) {

            this.runPlayerSpectateCommands(p);

        }
    }

    @EventHandler
    public void onConsume(PlayerItemConsumeEvent e) {
        Player p = e.getPlayer();
        this.handleEvent(e, p);
    }


    public void spectate(Player p, Spectatable target) {

        if (this.spectators.containsKey(p)) {
            return;
        }

        SpectateJoinEvent event = new SpectateJoinEvent(p, target);
        Bukkit.getPluginManager().callEvent(event);

        if (event.isCancelled()) {
            return;
        }

        this.playerData.put(p, new SpectatePlayerData(p));

        this.runPlayerSpectateCommands(p);

        this.spectators.put(p, target);

        target.spectate(p);
    }

    private void runPlayerSpectateCommands(Player p) {
        p.getInventory().clear();
        p.setGameMode(GameMode.ADVENTURE);

        p.setAllowFlight(true);
        p.setFlying(true);

        p.setHealth(p.getMaxHealth());
        p.setFoodLevel(20);

        this.hidePlayer(p);

        p.getInventory().setItem(0, Spectatable.SPECTATE_ITEM);
        p.getInventory().setItem(8, Spectatable.QUIT_SPECTATE_ITEM);
    }

    public void unspectate(Player p) {

        if (!spectators.containsKey(p)) {
            return;
        }

        Spectatable spectatable = spectators.remove(p);

        this.playerData.remove(p).restorePlayerData();
        this.showPlayer(p);

        spectatable.unspectate(p);

        SpectateQuitEvent event = new SpectateQuitEvent(p, spectatable);
        Bukkit.getPluginManager().callEvent(event);

    }

    private void showPlayer(Player p) {
        for (Player p1 : Bukkit.getOnlinePlayers()) {
            if (p1.equals(p))
                continue;
            p1.showPlayer(p);
        }
    }

    private void hidePlayer(Player p) {
        for (Player p1 : Bukkit.getOnlinePlayers()) {
            if (p1.equals(p))
                continue;
            p1.hidePlayer(p);
        }
    }

    private void handleEvent(Cancellable event, Player p) {
        if(this.spectators.containsKey(p)) {
            event.setCancelled(true);
        }
    }

    @Getter
    private class SpectatePlayerData {

        private Location location;
        private UUID uuid;
        private ItemStack[] contents;
        private ItemStack[] armor;
        private GameMode gameMode;
        private int level;
        private float exp;
        private boolean allowFlight;

        public SpectatePlayerData(Player p) {
            this.contents = p.getInventory().getContents();
            this.armor = p.getInventory().getArmorContents();
            this.location = p.getLocation();
            this.uuid = p.getUniqueId();
            this.gameMode = p.getGameMode();
            this.level = p.getLevel();
            this.exp = p.getExp();
            this.allowFlight = p.getAllowFlight();
        }

        public Player getPlayer() {
            return Bukkit.getPlayer(this.uuid);
        }

        public void restorePlayerData() {
            this.getPlayer().getInventory().clear();
            this.getPlayer().resetPlayerWeather();
            this.getPlayer().resetPlayerTime();
            this.getPlayer().getActivePotionEffects().forEach(e -> getPlayer().removePotionEffect(e.getType()));
            this.getPlayer().setMaxHealth(20);
            this.getPlayer().setHealth(getPlayer().getMaxHealth());
            this.getPlayer().setFoodLevel(20);
            this.getPlayer().getInventory().setArmorContents(this.armor);
            this.getPlayer().getInventory().setContents(this.contents);
            this.getPlayer().setGameMode(this.gameMode);
            this.getPlayer().setLevel(this.level);
            this.getPlayer().setExp(this.exp);
            this.getPlayer().setAllowFlight(this.allowFlight);
            this.getPlayer().teleport(this.location);
        }
    }

}
