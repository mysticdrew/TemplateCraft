package net.mysticdrew.templatecraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.mysticdrew.templatecraft.TemplateCraft;
import net.mysticdrew.templatecraft.common.TemplateCraftCreativeTab;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public abstract class BlockBase extends Block
{
    protected String name;

    public BlockBase(Material material, String name)
    {
        super(material);
        this.name = name;

        setCreativeTab(TemplateCraftCreativeTab.BLOCKS);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public BlockBase(Material materialIn)
    {
        super(materialIn);
        setCreativeTab(TemplateCraftCreativeTab.BLOCKS);
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel(ItemBlock itemBlock)
    {
        TemplateCraft.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
