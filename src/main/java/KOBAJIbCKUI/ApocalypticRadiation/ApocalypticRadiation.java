package KOBAJIbCKUI.ApocalypticRadiation;

import KOBAJIbCKUI.ApocalypticRadiation.common.CommonProxy;
import KOBAJIbCKUI.ApocalypticRadiation.meta.MetaData;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "apocalypticradiation")
public class ApocalypticRadiation {
    @SidedProxy(
            clientSide = "KOBAJIbCKUI.ApocalypticRadiation.client.ClientProxy",
            serverSide = "KOBAJIbCKUI.ApocalypticRadiation.common.CommonProxy"
    )
    public static CommonProxy proxy;

    //Pre-initialization
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MetaData.modMetadata(event.getModMetadata());
        //Proxy pre-initialization
        proxy.preInit(event);
    }

    //Initialization
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy initialization
        proxy.init(event);
    }

    //Post-initialization
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Proxy post-initialization
        proxy.postInit(event);
    }
}

