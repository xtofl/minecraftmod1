package xtofl;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = XtoflMod.MODID, version = XtoflMod.VERSION)
public class XtoflMod
{
    public static final String MODID = "XtoflMod";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
        System.out.println("Xtofl Mod preInit!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("Xtofl Mod initializing!");
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        System.out.println("Xtofl Mod postInit!");
    }

}
