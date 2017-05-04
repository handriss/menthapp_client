package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ButtonUpdater;

import static com.android.volley.VolleyLog.TAG;

public class RequestSender {

    public static void initializeButtonsInBulk(Context context, final ButtonUpdater<TransferObject[]> onSuccess){

        String url = "http://mcss.blue:8080/widget/getBulkdata";
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d(TAG, "onResponse: " + response);
                        TransferObject[] transferObjects = new TransferObject[1];
                        Log.d(TAG, "onResponse: " + response);

                        transferObjects[0] = new TransferObject();
                        transferObjects[0].setName("cicafül");
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

    public static void getOneButtonsStatus(){}

    public static void setOneButtonsStatus(){}

}
