package com.smarthome.menthacontrols.menthapp_client_new.request;

import android.support.v7.widget.AppCompatButton;

import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;

import java.util.List;

public class RequestSender{

    private List<AppCompatButton> buttons;
    private AppCompatButton button;


    public interface Updateable{

        void updateViewOnDownloadComplete(List<TransferObject> transferObjects);
    }




    public void initializeButtonsInBulk(List<AppCompatButton> buttons){
        this.buttons = buttons;
    }

    public void getOneButtonsStatus(AppCompatButton button){
        this.button = button;

    }

    public void setOneButtonsStatus(AppCompatButton button){
        this.button = button;

    }


}
