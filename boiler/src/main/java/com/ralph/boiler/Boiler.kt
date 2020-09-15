package com.ralph.boiler

import android.os.Build


/*
 * Created by Ralph Gabrielle Orden on 9/15/20.
 */

class Boiler {

    fun needPermission(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
    }

}