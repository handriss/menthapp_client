package com.smarthome.menthacontrols.menthapp_client_new.model.buttons;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;

public class OpeningSensorWidgetButton extends AppCompatButton implements RequestSender.ButtonCallbackHandler {

    private ButtonStatus buttonStatus = ButtonStatus.OFF;
    private static final int onIcon = R.drawable.os_red;
    private static final int offIcon = R.drawable.os_grn;

    public OpeningSensorWidgetButton(Context context) {
        super(context);
        this.setBackgroundResource(offIcon);
    }

    public OpeningSensorWidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackgroundResource(offIcon);
    }

    public OpeningSensorWidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setBackgroundResource(offIcon);
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
