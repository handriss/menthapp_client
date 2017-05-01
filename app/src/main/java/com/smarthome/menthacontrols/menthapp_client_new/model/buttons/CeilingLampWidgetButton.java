package com.smarthome.menthacontrols.menthapp_client_new.model;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;

public class CeilingLampWidgetButton extends AppCompatButton implements RequestSender.ButtonStatusInitializer {

    private ButtonStatus buttonStatus = ButtonStatus.OFF;
    private static final int onIcon = R.drawable.mlamp_yel;
    private static final int offIcon = R.drawable.mlamp;


    public CeilingLampWidgetButton(Context context) {
        super(context);
        this.setBackgroundResource(offIcon);
    }

    public CeilingLampWidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackgroundResource(offIcon);
    }

    public CeilingLampWidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setBackgroundResource(offIcon);
    }

    public void setButtonStatus(ButtonStatus buttonStatus) {

        this.buttonStatus = buttonStatus;

        if(this.buttonStatus == ButtonStatus.ON){
            setBackgroundResource(onIcon);
        }else if(this.buttonStatus == ButtonStatus.OFF){
            setBackgroundResource(offIcon);
        }
    }

    public void toggleButton(){

        if(this.buttonStatus == ButtonStatus.ON){
            this.buttonStatus = ButtonStatus.OFF;
            setBackgroundResource(offIcon);
        }else if(this.buttonStatus == ButtonStatus.OFF){
            this.buttonStatus = ButtonStatus.ON;
            setBackgroundResource(onIcon);
        }

    }

    @Override
    public void updateStatus(Boolean status) {
        if(status){
            this.buttonStatus = ButtonStatus.ON;
            setBackgroundResource(onIcon);
        }else{
            this.buttonStatus = ButtonStatus.OFF;
            setBackgroundResource(offIcon);
        }
    }
}