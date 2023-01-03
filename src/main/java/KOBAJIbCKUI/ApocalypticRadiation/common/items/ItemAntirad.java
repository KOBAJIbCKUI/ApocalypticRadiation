package KOBAJIbCKUI.ApocalypticRadiation.common.items;

import KOBAJIbCKUI.ApocalypticRadiation.meta.MetaData;
import net.minecraft.item.ItemFood;

public class ItemAntirad extends ItemFood {
    public ItemAntirad() {
        super(0, 0, false);
        setUnlocalizedName("antirad");
        setTextureName(MetaData.MODID + ":antirad");
        setMaxStackSize(64);
        setAlwaysEdible();
    }
}
