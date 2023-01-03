package KOBAJIbCKUI.ApocalypticRadiation;

import cpw.mods.fml.common.ModMetadata;

import java.util.Arrays;
import java.util.List;

public class MetaData {

    public static final String
        MODID = "apocalypticradiation",
        NAME = "Apocalyptic Radiation",
        VERSION = "0.1-ALPHA",
        URL = "https://github.com/KOBAJIbCKUI/ApocalypticRadiation";
    public static final List<String> AUTHORS = Arrays.asList("KOBAJIbCKUI");

    public static void modMetadata (ModMetadata meta) {
        meta.autogenerated = false;
        meta.modId = MODID;
        meta.name = NAME;
        meta.version = VERSION;
        meta.url = URL;
        meta.authorList = AUTHORS;
    }
}
