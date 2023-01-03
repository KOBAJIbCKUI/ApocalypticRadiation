package KOBAJIbCKUI.ApocalypticRadiation.common;

import KOBAJIbCKUI.ApocalypticRadiation.meta.MetaData;
import net.minecraft.item.Item;

public class ItemDosimeter extends Item {
    public ItemDosimeter () {
        setUnlocalizedName("dosimeter");
        setTextureName(MetaData.MODID + ":dosimeter");
        setMaxStackSize(1);
    }
}
