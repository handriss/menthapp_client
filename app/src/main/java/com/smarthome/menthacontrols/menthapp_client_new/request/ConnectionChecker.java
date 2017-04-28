package com.smarthome.menthacontrols.menthapp_client_new.request;


import com.smarthome.menthacontrols.menthapp_client_new.model.ConnectionStatus;

public class ConnectionChecker {

    private ConnectionStatus connectionStatus;

    public ConnectionChecker() {
        this.connectionStatus = ConnectionStatus.NO_CONNECTION;
    }

    public void refreshConnectionStatus(){

        if(this.getServiceStatus()){
            this.connectionStatus = ConnectionStatus.NOMINAL;
        }else if(this.getInternetStatus()){
            this.connectionStatus = ConnectionStatus.INTERNET;
        }else if(this.getNetworkStatus()){
            this.connectionStatus = ConnectionStatus.NETWORK;
        }else{
            this.connectionStatus = ConnectionStatus.NO_CONNECTION;
        }
    }

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
