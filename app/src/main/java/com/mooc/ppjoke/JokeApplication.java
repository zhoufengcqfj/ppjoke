package com.mooc.ppjoke;

import android.app.Application;

import com.mooc.libnetwork.ApiService;

public class JokeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiService.init("http://123.56.232.18:8080/serverdemo", null);

//        CrashReport.initCrashReport(getApplicationContext(), "eb455a94a3", true);
    }
}
