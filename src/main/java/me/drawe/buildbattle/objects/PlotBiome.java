package me.drawe.buildbattle.objects;

import me.drawe.buildbattle.BuildBattle;
import me.drawe.buildbattle.utils.ItemCreator;
import me.kangarko.compatbridge.model.CompMaterial;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

public enum PlotBiome {

    PLAINS("Plains", Biome.PLAINS, ItemCreator.create(CompMaterial.GRASS, 1, Message.GUI_BIOMES_PLAINS_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.plains.lore")), null, null), 0),
    MESA("Mesa", Biome.BADLANDS, ItemCreator.create(CompMaterial.ORANGE_TERRACOTTA, 1, Message.GUI_BIOMES_MESA_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.mesa.lore")), null, null), 1),
    OCEAN("Ocean", Biome.OCEAN, ItemCreator.create(CompMaterial.WATER_BUCKET, 1, Message.GUI_BIOMES_OCEAN_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.ocean.lore")), null, null), 2),
    DESERT("Desert", Biome.DESERT, ItemCreator.create(CompMaterial.SAND, 1, Message.GUI_BIOMES_DESERT_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.desert.lore")), null, null), 3),
    FOREST("Forest", Biome.FOREST, ItemCreator.create(CompMaterial.OAK_LOG, 1, Message.GUI_BIOMES_FOREST_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.forest.lore")), null, null), 4),
    JUNGLE("Jungle", Biome.JUNGLE, ItemCreator.create(CompMaterial.VINE, 1, Message.GUI_BIOMES_JUNGLE_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.jungle.lore")), null, null), 5),
    SWAMP("Swamp", Biome.SWAMP, ItemCreator.create(CompMaterial.LILY_PAD, 1, Message.GUI_BIOMES_SWAMP_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.swamp.lore")), null, null), 6),
    SAVANNA("Savanna", Biome.SAVANNA, ItemCreator.create(CompMaterial.ACACIA_LOG, 1, Message.GUI_BIOMES_SAVANNA_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.savanna.lore")), null, null), 7),
    BEACH("Beach", Biome.BEACH, ItemCreator.create(CompMaterial.SAND, 1, Message.GUI_BIOMES_BEACH_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.beach.lore")), null, null), 8),
    ICE_SPIKES("Ice Spikes", Biome.ICE_SPIKES, ItemCreator.create(CompMaterial.PACKED_ICE, 1, Message.GUI_BIOMES_ICE_SPIKES_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.ice_spikes.lore")), null, null), 9),
    NETHER("Nether", Biome.NETHER, ItemCreator.create(CompMaterial.NETHER_BRICKS, 1, Message.GUI_BIOMES_NETHER_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.nether.lore")), null, null), 10),
    THE_END("The End", Biome.THE_END, ItemCreator.create(CompMaterial.DRAGON_EGG, 1, Message.GUI_BIOMES_THE_END_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.the_end.lore")), null, null), 11),
    MOUNTAINS("Mountains", Biome.MOUNTAINS, ItemCreator.create(CompMaterial.STONE, 1, Message.GUI_BIOMES_MOUNTAINS_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.mountains.lore")), null, null), 12),
    TAIGA("Taiga", Biome.TAIGA, ItemCreator.create(CompMaterial.SPRUCE_LOG, 1, Message.GUI_BIOMES_TAIGA_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.taiga.lore")), null, null), 13),
    RIVER("River", Biome.RIVER, ItemCreator.create(CompMaterial.WATER_BUCKET, 1, Message.GUI_BIOMES_RIVER_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.river.lore")), null, null), 14),
    MUSHROOM("Mushroom Fields", Biome.MUSHROOM_FIELDS, ItemCreator.create(CompMaterial.RED_MUSHROOM, 1, Message.GUI_BIOMES_MUSHROOM_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.mushroom.lore")), null, null), 15),
    WARM_OCEAN("Warm Ocean", Biome.WARM_OCEAN, ItemCreator.create(CompMaterial.TUBE_CORAL, 1, Message.GUI_BIOMES_WARM_OCEAN_DISPLAYNAME.getMessage(), ItemCreator.convertLore(BuildBattle.getFileManager().getConfig("messages.yml").get().getStringList("gui.biomes.items.warm_ocean.lore")), null, null), 13),


    ;

    private String name;
    private Biome biome;
    private int slot;
    private ItemStack item;

    PlotBiome(String name, Biome biome, ItemStack itemStack, int slot) {
        this.name = name;
        this.slot = slot;
        this.item = itemStack;
        this.biome = biome;
    }

    public Biome getBiome() {
        return this.biome;
    }

    public int getSlot() {
        return this.slot;
    }

    public ItemStack getItem() {
        return this.item;
    }

    public static PlotBiome getBiomeFromItemStack(ItemStack item, int slot) {
        for (PlotBiome biome : values()) {
            if ((biome.getItem().isSimilar(item)) && (biome.getSlot() == slot)) {
                return biome;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
