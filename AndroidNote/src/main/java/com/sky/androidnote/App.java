package com.sky.androidnote;

import android.app.Application;
import android.content.Intent;

/**
 * Created by Administrator on 2016/5/16.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        startService(new Intent(this, CoreService.class));
    }
}
