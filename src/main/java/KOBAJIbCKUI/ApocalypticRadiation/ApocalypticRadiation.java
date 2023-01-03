package KOBAJIbCKUI.ApocalypticRadiation;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "apocalypticradiation")
public class ApocalypticRadiation {

    //Pre-initialization
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MetaData.modMetadata(event.getModMetadata());
    }

    //Initialization
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    //Post-initialization
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

