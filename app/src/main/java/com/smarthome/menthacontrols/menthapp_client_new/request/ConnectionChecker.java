package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

public class ConnectionChecker {

    public enum ConnectionStatus {NOMINAL, INTERNET, NO_CONNECTION}

    private static final String TAG = "ConnectionChecker";
    private ConnectionStatus connectionStatus;
    private Context context;

    public ConnectionChecker(Context context) {
        this.connectionStatus = ConnectionStatus.NO_CONNECTION;
        this.context = context;
    }

    public void refreshConnectionStatus(){

        if(this.getServiceStatus()){
            this.connectionStatus = ConnectionStatus.NOMINAL;
            Log.d(TAG, "Connection status is NOMINAL");

        }else if(this.getInternetStatus()){
            this.connectionStatus = ConnectionStatus.INTERNET;
            Log.d(TAG, "Connection status is INTERNET");

        }else{
            this.connectionStatus = ConnectionStatus.NO_CONNECTION;
            Log.d(TAG, "Connection status is NO_CONNECTION");

        }
    }

    private Boolean getServiceStatus(){
        return false;
    }

    private Boolean getInternetStatus(){

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}
