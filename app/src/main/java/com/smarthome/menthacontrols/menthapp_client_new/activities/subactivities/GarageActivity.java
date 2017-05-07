package com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.BaseLiveActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;

import java.util.ArrayList;
import java.util.List;


public class GarageActivity extends BaseLiveActivity {

    private List<BaseButton> buttons;
    private static final String TAG = "GarageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        initButtons();
        loadButtonsInBulk(buttons);
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

    @Override
    public Class getActivityToTheLeft() {
        return UpstairsActivity.class;
    }

    @Override
    public Class getActivityToTheRight() {
        return UtilitiesActivity.class;
    }

    public void changeToBedroom(View view){
        Intent intent = new Intent(this, BedRoomActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
    }

    public void changeToGarage(View view){
        Intent intent = new Intent(this, GarageActivity.class);
        startActivity(intent);
    }

    public void changeToLivingroom(View view){
        Intent intent = new Intent(this, LivingRoomActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
    }

    public void changeToUpstairs(View view){
        Intent intent = new Intent(this, UpstairsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
    }

    public void changeToUtilities(View view){
        Intent intent = new Intent(this, UtilitiesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }
}
