package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ConnectionChecker {


    private static final String TAG = "ConnectionChecker";
    private Context context;

    public ConnectionChecker(Context context) {
        this.context = context;
    }

    public void refreshConnectionStatus(){

        if(!this.getInternetStatus()){
            Toast.makeText(context, "Nincs internetkapcsolat.", Toast.LENGTH_LONG).show();
        }

    }


    private Boolean getInternetStatus(){

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}
