package com.smarthome.menthacontrols.menthapp_client_new.request;


import com.smarthome.menthacontrols.menthapp_client_new.model.ConnectionStatus;

public class ConnectionChecker {

    private ConnectionStatus connectionStatus;

    public ConnectionChecker() {
        this.connectionStatus = ConnectionStatus.NO_CONNECTION;
    }

    public void refreshConnectionStatus(){}

    private Boolean getServiceStatus(){
        return false;
    }

    private Boolean getInternetStatus(){
        return false;
    }

    private Boolean getNetworkStatus(){
        return false;
    }
}
