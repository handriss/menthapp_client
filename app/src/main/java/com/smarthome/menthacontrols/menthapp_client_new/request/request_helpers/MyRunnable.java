package com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers;


import java.io.Serializable;

public interface MyRunnable<T> extends Serializable
{
    void run(T t);
}