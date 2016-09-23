package net.mysticdrew.templatecraft.common;

import net.minecraft.item.Item;

/**
 * Created by Mysticdrew on 9/19/2016.
 */
public interface CommonProxy
{
    default void registerItemRenderer(Item item, int meta, String id)
    {
    }
}
