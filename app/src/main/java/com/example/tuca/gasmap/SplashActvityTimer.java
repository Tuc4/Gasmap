package com.example.tuca.gasmap;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Bruno on 14/03/2018.
 */

public class SplashActvityTimer extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
