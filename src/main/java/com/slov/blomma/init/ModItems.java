package com.slov.blomma.init;

import com.slov.blomma.Blomma;
import com.slov.blomma.objects.items.SpiderLilyItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Blomma.MODID);
	
	public static final RegistryObject<Item> SPIDER_LILY = ITEMS.register("spider_lily", SpiderLilyItem::new);
}
