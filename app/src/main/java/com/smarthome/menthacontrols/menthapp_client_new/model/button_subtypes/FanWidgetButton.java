package com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes;

import android.content.Context;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;


public class FanWidgetButton extends BaseButton{

    private final int onIcon = R.drawable.vent_yel;
    private final int offIcon = R.drawable.vent;

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

    @Override
    public int getOnIcon() {
        return this.onIcon;
    }

    @Override
    public int getOffIcon() {
        return this.offIcon;
    }

}
