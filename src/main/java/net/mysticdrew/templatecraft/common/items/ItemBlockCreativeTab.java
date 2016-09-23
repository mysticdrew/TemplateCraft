package net.mysticdrew.templatecraft.common.items;

import net.minecraft.item.Item;
import net.mysticdrew.templatecraft.TemplateCraft;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class ItemBlockCreativeTab extends Item
{

    protected String name;

    public ItemBlockCreativeTab(String name)
    {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel()
    {
        TemplateCraft.proxy.registerItemRenderer(this, 0, name);
    }
}
