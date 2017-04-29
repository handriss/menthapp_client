package com.smarthome.menthacontrols.menthapp_client_new.model;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;

public class OpeningSensorWidgetButton extends AppCompatButton {

    private ButtonStatus buttonStatus = ButtonStatus.OFF;
    private static final int onIcon = R.drawable.os_red;
    private static final int offIcon = R.drawable.os_grn;

    public OpeningSensorWidgetButton(Context context) {
        super(context);
    }

    public OpeningSensorWidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OpeningSensorWidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
