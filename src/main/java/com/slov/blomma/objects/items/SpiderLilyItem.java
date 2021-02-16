package com.slov.blomma.objects.items;

import com.slov.blomma.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SpiderLilyItem extends BlockNamedItem {

	public SpiderLilyItem() {
		super(ModBlocks.SPIDER_LILY.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
