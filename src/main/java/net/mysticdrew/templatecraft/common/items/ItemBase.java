package net.mysticdrew.templatecraft.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.mysticdrew.templatecraft.TemplateCraft;
import net.mysticdrew.templatecraft.common.TemplateCraftCreativeTab;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public abstract class ItemBase extends Item
{

    protected String name;

    public ItemBase(String name)
    {
        this.name = name;
        setCreativeTab(TemplateCraftCreativeTab.ITEMS);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel()
    {
        TemplateCraft.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
