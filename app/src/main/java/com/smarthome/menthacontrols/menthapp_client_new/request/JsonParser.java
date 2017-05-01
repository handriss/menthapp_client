package com.smarthome.menthacontrols.menthapp_client_new.request;


import android.util.Log;

import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.RoomTypeEnum;

import org.json.JSONException;
import org.json.JSONObject;


public class JsonParser {

    private static final String TAG = "JsonParser";

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
