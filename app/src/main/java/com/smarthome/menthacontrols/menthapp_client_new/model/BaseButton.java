package com.smarthome.menthacontrols.menthapp_client_new.model;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;

public abstract class BaseButton extends AppCompatButton {

    private String owner;
    private ButtonStatus buttonStatus = ButtonStatus.OFF;

    public BaseButton(Context context) {
        super(context);
    }

    public BaseButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract int getOnIcon();
    public abstract int getOffIcon();

    public void setButtonStatus(ButtonStatus buttonStatus) {

        this.buttonStatus = buttonStatus;

        if(this.buttonStatus == ButtonStatus.ON){
            setBackgroundResource(getOnIcon());
        }else if(this.buttonStatus == ButtonStatus.OFF){
            setBackgroundResource(getOffIcon());
        }
    }

    public void toggleButton(){

        if(this.buttonStatus == ButtonStatus.ON){
            this.buttonStatus = ButtonStatus.OFF;
            setBackgroundResource(getOffIcon());
        }else if(this.buttonStatus == ButtonStatus.OFF){
            this.buttonStatus = ButtonStatus.ON;
            setBackgroundResource(getOnIcon());
        }

    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
