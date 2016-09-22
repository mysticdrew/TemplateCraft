package net.mysticdrew.templatecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.mysticdrew.templatecraft.common.CommonProxy;
import net.mysticdrew.templatecraft.common.reference.Reference;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TemplateCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static TemplateCraft instance;

    @SidedProxy(clientSide = "net.mysticdrew.templatecraft.client.ClientProxy", serverSide = "net.mysticdrew.templatecraft.server.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
//        System.out.println("test1");
//        List<String> list = new ArrayList();
//        for (int i = 0; i < 20; i++) {
//            list.add("Value: " + i);
//        }
//
//        list.forEach(System.out::println);
        //System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
