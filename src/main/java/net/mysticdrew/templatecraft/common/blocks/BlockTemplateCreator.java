package net.mysticdrew.templatecraft.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class BlockTemplateCreator extends BlockBase
{
    public BlockTemplateCreator(String name)
    {
        super(Material.IRON, name);
        setHardness(5f);
        setResistance(100000f);
    }

    @Override
    public BlockTemplateCreator setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
