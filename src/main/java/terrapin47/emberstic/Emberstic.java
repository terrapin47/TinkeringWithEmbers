package terrapin47.emberstic;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import terrapin47.emberstic.proxy.CommonProxy;

@Mod(modid = terrapin47.emberstic.Emberstic.MODID, name = terrapin47.emberstic.Emberstic.MODNAME, version = terrapin47.emberstic.Emberstic.MODVERSION, useMetadata = true, dependencies = "required-after:embers;required-after:tconstruct;required-after:conarm")
public class Emberstic {

    public static final String MODID = "emberstic";
    public static final String MODNAME = "Emberstic";
    public static final String MODVERSION= "0.1.0";

    @SidedProxy(clientSide = "terrapin47.emberstic.proxy.ClientProxy", serverSide = "terrapin47.emberstic.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static terrapin47.emberstic.Emberstic instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
