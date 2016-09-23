package net.mysticdrew.templatecraft.common.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class Items
{
    public static ItemBlockCreativeTab creativeBlockItem;

    public static void init()
    {
        creativeBlockItem = registerNoTabItem(new ItemBlockCreativeTab("creativeTabBlockIcon"));
    }

    private static ItemBlockCreativeTab registerNoTabItem(ItemBlockCreativeTab item)
    {
        GameRegistry.register(item);
        item.registerItemModel();
        return item;
    }

    private static <T extends Item> T register(T item)
    {
        GameRegistry.register(item);

        if (item instanceof ItemBase)
        {
            ((ItemBase) item).registerItemModel();
        }

        return item;
    }
}
