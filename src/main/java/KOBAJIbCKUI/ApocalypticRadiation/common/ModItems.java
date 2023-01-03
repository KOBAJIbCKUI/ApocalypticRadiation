package KOBAJIbCKUI.ApocalypticRadiation.common;

import KOBAJIbCKUI.ApocalypticRadiation.common.items.ItemAntirad;
import KOBAJIbCKUI.ApocalypticRadiation.common.items.ItemDosimeter;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemDosimeter DOSIMETER = new ItemDosimeter();
    public static final ItemAntirad ANTIRAD = new ItemAntirad();
    public static void register() {
        GameRegistry.registerItem(DOSIMETER, DOSIMETER.getUnlocalizedName());
        GameRegistry.registerItem(ANTIRAD, ANTIRAD.getUnlocalizedName());
    }
}
