package net.mysticdrew.templatecraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Mysticdrew on 9/22/2016.
 */
public class BlockGuide extends BlockBase
{
    public BlockGuide(String name)
    {
        super(Material.ROCK, name);
        setHardness(1f);
        setResistance(1f);
    }

    @Override
    public BlockGuide setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos blockPos, EnumFacing side)
    {
        IBlockState state = blockAccess.getBlockState(blockPos);
        Block block = state.getBlock();
        IBlockState state2 = blockAccess.getBlockState(blockPos.offset(side));
        Block block2 = state2.getBlock();
        if (block.getMetaFromState(state) != block2.getMetaFromState(state2))
        {
            return true;
        }

        if (block2 == this)
        {
            return false;
        }

        return block2 != this && super.shouldSideBeRendered(blockState, blockAccess, blockPos, side);
    }

    @Override
    public boolean isBlockNormalCube(IBlockState state)
    {
        return false;
    }

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return null;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 0;
    }
}
