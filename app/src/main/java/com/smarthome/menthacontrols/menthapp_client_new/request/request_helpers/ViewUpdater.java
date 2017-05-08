package com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers;


import java.io.Serializable;

public interface ViewUpdater<T> extends Serializable
{
    void updateStatus(T t);
}