package net.mysticdrew.templatecraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class Blocks
{
    public static BlockBase blockTemplateCreator;
    public static BlockBase blockGuide;

    public static void init()
    {
        blockTemplateCreator = register(new BlockTemplateCreator("blockTemplateCreator"));
        blockGuide = register(new BlockGuide("blockGuide"));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock)
    {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase)
        {
            ((BlockBase) block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block)
    {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
