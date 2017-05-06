package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ConnectionChecker {

    public enum ConnectionStatus {INTERNET, NO_CONNECTION}

    private static final String TAG = "ConnectionChecker";
    private ConnectionStatus connectionStatus;
    private Context context;

    public ConnectionChecker(Context context) {
        this.connectionStatus = ConnectionStatus.NO_CONNECTION;
        this.context = context;

    }

    public void refreshConnectionStatus(){

        if(!this.getInternetStatus()){
            this.connectionStatus = ConnectionStatus.INTERNET;
        }else{
            this.connectionStatus = ConnectionStatus.NO_CONNECTION;
            Toast.makeText(context, "Nincs internetkapcsolat.", Toast.LENGTH_LONG).show();
        }

    }

    private Boolean getInternetStatus(){

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}
