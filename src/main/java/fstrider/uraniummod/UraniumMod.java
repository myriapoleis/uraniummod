package fstrider.uraniummod;

import fstrider.uraniummod.block.UBlocks;
import fstrider.uraniummod.crafting.UCrafting;
import fstrider.uraniummod.crafting.UFurnaceManager;
import fstrider.uraniummod.item.UItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UraniumMod implements ModInitializer {
    static {
        //this is here to possibly fix some class loading issues, do not delete
        try {
            Class.forName("net.minecraft.core.block.Block");
            Class.forName("net.minecraft.core.item.Item");
        } catch (ClassNotFoundException ignored) {}
    }
    public static final String MOD_ID = "uraniummod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static int itemIdOffset = 19400;
    public static int blockIdOffset = 940;
    public void onInitialize() {
        LOGGER.info("UraniumMod initializing, WIP");
        UItems.register(); //load items
        UBlocks.register(); //load blocks
        UCrafting.register(); //load crafting recipes
        UFurnaceManager.register(); //load furnace recipes
    }
}
