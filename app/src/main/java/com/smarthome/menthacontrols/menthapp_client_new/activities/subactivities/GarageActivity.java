package com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities;

import android.os.Bundle;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.BaseActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;

import java.util.ArrayList;
import java.util.List;


public class GarageActivity extends BaseActivity {

    private List<BaseButton> buttons;
    private static final String TAG = "GarageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        initButtons();
    }


    private void initButtons() {

        this.buttons = new ArrayList<>();

        BaseButton currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k12);
        currentButton.setOwner("p_oli_k12");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k7_1);
        currentButton.setOwner("p_oli_k7");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k7_2);
        currentButton.setOwner("p_oli_k7");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k7b_1);
        currentButton.setOwner("p_oli_k7b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k7b_2);
        currentButton.setOwner("p_oli_k7b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_45);
        currentButton.setOwner("p_oli_45");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_10);
        currentButton.setOwner("p_oli_10");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_1);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_2);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_3);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_4);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_43);
        currentButton.setOwner("p_oli_43");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_41);
        currentButton.setOwner("p_oli_41");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_40);
        currentButton.setOwner("p_oli_40");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_44);
        currentButton.setOwner("p_oli_44");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_46);
        currentButton.setOwner("p_oli_46");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_8);
        currentButton.setOwner("p_oli_8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_7);
        currentButton.setOwner("p_oli_7");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k10);
        currentButton.setOwner("p_oli_k10");
        this.buttons.add(currentButton);

        currentButton = (FanWidgetButton) findViewById(R.id.p_ve3);
        currentButton.setOwner("p_ve3");
        this.buttons.add(currentButton);


        for(Button button : buttons){
            button.setOnClickListener(this);
        }

    }


    @Override
    public List<BaseButton> getButtons() {
        return this.buttons;
    }
}
