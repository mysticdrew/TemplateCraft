package net.mysticdrew.templatecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.mysticdrew.templatecraft.common.items.Items;
import net.mysticdrew.templatecraft.common.reference.Reference;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class TemplateCraftCreativeTab
{
    public static final CreativeTabs ITEMS = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public String getTabLabel()
        {
            return Reference.MOD_ID + ".items";
        }

        @Override
        public Item getTabIconItem()
        {
            return Items.creativeBlockItem;
        }
    };

    public static final CreativeTabs BLOCKS = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public String getTabLabel()
        {
            return Reference.MOD_ID + ".blocks";
        }

        @Override
        public Item getTabIconItem()
        {
            return Items.creativeBlockItem;
        }
    };
}
