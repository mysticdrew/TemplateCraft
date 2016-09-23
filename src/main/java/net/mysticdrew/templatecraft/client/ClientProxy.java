package net.mysticdrew.templatecraft.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.mysticdrew.templatecraft.common.CommonProxy;
import net.mysticdrew.templatecraft.common.reference.Reference;

/**
 * Created by Mysticdrew on 9/19/2016.
 */
public class ClientProxy implements CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id, "inventory"));
    }
}
