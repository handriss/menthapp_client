package com.smarthome.menthacontrols.menthapp_client_new.request;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class RequestHandler {

    private AppCompatActivity activity;

    public RequestHandler(AppCompatActivity activity) {
        this.activity = activity;

        Log.d("requestHandler", activity.toString());
    }
}
