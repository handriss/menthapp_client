package com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;


public class FanWidgetButton extends AppCompatButton{

    private String owner;
    private ButtonStatus buttonStatus = ButtonStatus.OFF;
    private static final int onIcon = R.drawable.vent_yel;
    private static final int offIcon = R.drawable.vent;

    public FanWidgetButton(Context context) {
        super(context);
        this.setBackgroundResource(offIcon);
    }

    public FanWidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackgroundResource(offIcon);
    }

    public FanWidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setBackgroundResource(offIcon);
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

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
