package com.smarthome.menthacontrols.menthapp_client_new.model;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.smarthome.menthacontrols.menthapp_client_new.R;

public class ColoredButton extends AppCompatButton {

    private boolean isRed = true;

    public ColoredButton(Context context) {
        super(context);
    }

    public ColoredButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColoredButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setIsRed(boolean isRed) {
        this.isRed = isRed;
        changeBgColor();
    }

    private void changeBgColor() {
        setBackgroundResource(isRed ? R.drawable.bg_red : R.drawable.bg_green);
        setText(isRed? "Red" : "Green");
    }

}