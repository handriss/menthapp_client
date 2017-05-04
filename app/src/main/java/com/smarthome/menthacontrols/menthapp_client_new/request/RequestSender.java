package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ButtonUpdater;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.JsonParser;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.TransferObject;

import java.util.List;

import static com.android.volley.VolleyLog.TAG;

public class RequestSender {

    public static void initializeButtonsInBulk(Context context, final ButtonUpdater<List<TransferObject>> onSuccess){

        String url = "http://mcss.blue:8080/widget/getBulkdata";
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    List<TransferObject> transferObjects = JsonParser.createListOfTransferObjectsFromJson(response);
                    onSuccess.updateStatus(transferObjects);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "An error happened during the http request: " + error.getMessage() );
            }
        });

        requestQueue.add(stringRequest);

    }

    public static void getOneButtonsStatus(Context context, BaseButton baseButton){

//        String status;
//        if(baseButton.getButtonStatus() == ButtonStatus.ON){
//            status = "ON";
//        }else{
//            status = "OFF";
//        }
//        String url = "http://mcss.blue:8080/widget/" + baseButton.getOwner() + status;


    }

    public static void setOneButtonsStatus(Context context, BaseButton baseButton){

        String status;
        if(baseButton.getButtonStatus() == ButtonStatus.ON){
            status = "ON";
        }else{
            status = "OFF";
        }

        String url = "http://mcss.blue:8080/widget/" + baseButton.getOwner() + "/" + status;
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d(TAG, "onResponse: " + response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "An error happened during the http request: " + error.getMessage() );
            }
        });

        requestQueue.add(stringRequest);
    }

}
