package KOBAJIbCKUI.ApocalypticRadiation.common;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemDosimeter DOSIMETER = new ItemDosimeter();
    public static void register() {
        GameRegistry.registerItem(DOSIMETER, DOSIMETER.getUnlocalizedName());
    }
}
