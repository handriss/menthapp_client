package com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities;

import android.os.Bundle;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.BaseActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;

import java.util.List;


public class UtilitiesActivity extends BaseActivity {

    private static final String TAG = "UtilitiesActivity";
    private List<BaseButton> buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities);
    }


    @Override
    public List<BaseButton> getButtons() {
        return this.buttons;
    }
}
