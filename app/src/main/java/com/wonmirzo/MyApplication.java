package com.wonmirzo;

import android.app.Application;

import com.wonmirzo.manager.LocaleManager;

public class MyApplication extends Application {
    public static final String TAG = MyApplication.class.getSimpleName();
    public static LocaleManager localeManager;

    @Override
    public void onCreate() {
        super.onCreate();
        localeManager = new LocaleManager(this);
        localeManager.setLocale(this);
    }
}
