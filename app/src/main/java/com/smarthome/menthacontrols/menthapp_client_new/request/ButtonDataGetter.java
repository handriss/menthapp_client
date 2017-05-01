package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.os.AsyncTask;

import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.DownloadStatus;

import java.util.ArrayList;
import java.util.List;

public class ButtonDataGetter extends AsyncTask<String, Void, List<TransferObject>> implements RequestSender.OnDownloadCompleteHandler {

    private static final String TAG = "ButtonDataGetter";
    private List<TransferObject> transferObjects;
    private String baseUrl = "http://mcss.blue:8080/";

    private ButtonCallbackHandler button;

    @Override
    protected List<TransferObject> doInBackground(String... params) {

        return null;
    }

    @Override
    protected void onPostExecute(List<TransferObject> transferObjects) {
        super.onPostExecute(transferObjects);
    }

    public interface ButtonCallbackHandler{
        void updateStatus(Boolean status);
    }


    public void setButton(ButtonCallbackHandler button) {
        this.button = button;
    }

    public void updateButtonsInBulk(){

        String destinationUri = this.baseUrl + "widget/getBulkdata";
    }

    public void updateOneButton(String widgetName){

        String destinationUri = this.baseUrl + "widget/" +  widgetName;

    }

    public void setOneButton(String widgetName){

        String destinationUri = this.baseUrl + "widget/" +  widgetName;

    }

    @Override
    public void onDownloadComplete(String data, DownloadStatus status) {

        if(status == DownloadStatus.OK){
            transferObjects = new ArrayList<>();
        }

//        ez a method arra lenne jó, hogy sok objectet kiszedjek a databól

    }
}
