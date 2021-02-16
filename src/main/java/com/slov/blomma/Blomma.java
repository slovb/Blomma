package com.slov.blomma;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.slov.blomma.init.ModBlocks;
import com.slov.blomma.init.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Blomma.MODID)
public class Blomma
{
	public static final String MODID = "blomma";
	
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Blomma() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
