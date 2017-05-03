package com.smarthome.menthacontrols.menthapp_client_new;


import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    public static Context getContext()
    {
        return context;
    }

    private static Context context;

    @Override
    public void onCreate()
    {
        super.onCreate();

        context = getApplicationContext();
        //custom code
    }
}