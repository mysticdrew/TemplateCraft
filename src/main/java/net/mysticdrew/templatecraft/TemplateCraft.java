package net.mysticdrew.templatecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.mysticdrew.templatecraft.common.CommonProxy;
import net.mysticdrew.templatecraft.common.blocks.Blocks;
import net.mysticdrew.templatecraft.common.items.Items;
import net.mysticdrew.templatecraft.common.reference.Reference;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TemplateCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static TemplateCraft instance;

    @SidedProxy(clientSide = "net.mysticdrew.templatecraft.client.ClientProxy", serverSide = "net.mysticdrew.templatecraft.server.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        Blocks.init();
        Items.init();
    }
}
