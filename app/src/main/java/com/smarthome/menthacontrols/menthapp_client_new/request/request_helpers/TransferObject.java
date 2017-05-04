package com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers;


import com.smarthome.menthacontrols.menthapp_client_new.model.enums.RoomTypeEnum;

public class TransferObject {

    private String name;
    private Boolean widgetStatus;
    private RoomTypeEnum roomTypeEnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWidgetStatus() {
        return widgetStatus;
    }

    public void setWidgetStatus(Boolean widgetStatus) {
        this.widgetStatus = widgetStatus;
    }

    public RoomTypeEnum getRoomTypeEnum() {
        return roomTypeEnum;
    }

    public void setRoomTypeEnum(RoomTypeEnum roomTypeEnum) {
        this.roomTypeEnum = roomTypeEnum;
    }

}
