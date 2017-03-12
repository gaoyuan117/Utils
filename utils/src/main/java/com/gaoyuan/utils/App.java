package com.gaoyuan.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by gaoyuan on 2017/3/12.
 */

public class App extends Application{
    public static Context app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
