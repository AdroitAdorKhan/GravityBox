package com.wrbug.gravitybox.nougat.quicksettings;

import de.robv.android.xposed.XSharedPreferences;

public class FlashlightTile extends AospTile {
    public static final String AOSP_KEY = "flashlight";

    protected FlashlightTile(Object host, Object tile, XSharedPreferences prefs,
            QsTileEventDistributor eventDistributor) throws Throwable {
        super(host, "aosp_tile_torch", tile, prefs, eventDistributor);
    }

    @Override
    public String getAospKey() {
        return AOSP_KEY;
    }
}
