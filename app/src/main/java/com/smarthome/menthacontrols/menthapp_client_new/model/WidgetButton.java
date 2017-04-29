package com.smarthome.menthacontrols.menthapp_client_new.model;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;

public class WidgetButton extends AppCompatButton {

    public enum ButtonStatus {ON, OFF};

    private ButtonStatus buttonStatus = ButtonStatus.OFF;

    public WidgetButton(Context context) {
        super(context);
        this.setBackgroundResource(R.drawable.flamp);
    }

    public WidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackgroundResource(R.drawable.flamp);
    }

    public WidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setBackgroundResource(R.drawable.flamp);
    }

    public void toggleButton(){

        if(this.buttonStatus == ButtonStatus.ON){
            this.buttonStatus = ButtonStatus.OFF;
            setBackgroundResource(R.drawable.flamp);
        }else if(this.buttonStatus == ButtonStatus.OFF){
            this.buttonStatus = ButtonStatus.ON;
            setBackgroundResource(R.drawable.flamp_yel);
        }

    }

}
