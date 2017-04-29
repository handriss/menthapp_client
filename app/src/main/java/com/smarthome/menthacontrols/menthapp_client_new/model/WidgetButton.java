package com.smarthome.menthacontrols.menthapp_client_new.model;


import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;

public class WidgetButton extends AppCompatButton {

    private boolean isRed = true;

    public WidgetButton(Context context) {
        super(context);
    }

    public WidgetButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WidgetButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setIsRed(boolean isRed) {
        this.isRed = isRed;
        changeBgColor();
    }

    private void changeBgColor() {
        setBackgroundResource(isRed ? R.drawable.flamp : R.drawable.flamp_yel);
        setText(isRed? "Red" : "Green");
    }
}
