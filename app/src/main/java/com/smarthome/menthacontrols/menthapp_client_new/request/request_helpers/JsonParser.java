package com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers;


import android.util.Log;

import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.RoomTypeEnum;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class JsonParser {

    private static final String TAG = "JsonParser";

    public static List<TransferObject> createListOfTransferObjectsFromJson(String result){

        List<TransferObject> transferObjects = new ArrayList<>();

        Log.d(TAG, "createListOfTransferObjectsFromJson: " + result);

        JSONObject jObject = null;
        try {

            JSONArray jsonarray = new JSONArray(result);
            for (int i = 0; i < jsonarray.length(); i++) {
                JSONObject jsonobject = jsonarray.getJSONObject(i);

                TransferObject transferObject = new TransferObject();
                transferObject.setName(jsonobject.getString("name"));
                transferObject.setWidgetStatus(jsonobject.getBoolean("widgetStatus"));
                transferObject.setRoomTypeEnum(RoomTypeEnum.valueOf(jsonobject.getString("roomTypeEnum")));
                transferObjects.add(transferObject);
            }

        } catch (JSONException e) {
            Log.d(TAG, "createListOfTransferObjectsFromJson: An error happened during parsing the result string.");
        }


        return transferObjects;
    }

    public static TransferObject createTransferObjectFromJson(String result){

        try {

            TransferObject transferObject = new TransferObject();

            JSONObject jObject = new JSONObject(result);
            String name = jObject.getString("name");
            Boolean widgetStatus = jObject.getBoolean("widgetStatus");
            RoomTypeEnum roomTypeEnum = RoomTypeEnum.valueOf(jObject.getString("roomTypeEnum"));

            transferObject.setName(name);
            transferObject.setWidgetStatus(widgetStatus);
            transferObject.setRoomTypeEnum(roomTypeEnum);

            return transferObject;

        } catch (JSONException e) {
            Log.d(TAG, "createTransferObjectFromJson: error converting string to json: " + e.getMessage());
        }

        return null;
    }
}
