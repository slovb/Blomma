package com.slov.blomma.init;

import com.slov.blomma.Blomma;
import com.slov.blomma.objects.blocks.SpiderLilyBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Blomma.MODID);

	public static final RegistryObject<Block> SPIDER_LILY = BLOCKS.register("spider_lily", SpiderLilyBlock::new);
}
