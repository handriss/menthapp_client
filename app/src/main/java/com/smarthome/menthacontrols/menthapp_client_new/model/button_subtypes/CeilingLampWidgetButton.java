package com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes;


import android.content.Context;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;

public class CeilingLampWidgetButton extends BaseButton{

    private int onIcon = R.drawable.mlamp_yel;
    private int offIcon = R.drawable.mlamp;


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

    @Override
    public int getOnIcon() {
        return this.onIcon;
    }

    @Override
    public int getOffIcon() {
        return this.offIcon;
    }

}
