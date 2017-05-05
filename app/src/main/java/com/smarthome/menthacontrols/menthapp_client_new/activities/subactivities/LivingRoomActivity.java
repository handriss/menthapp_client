package com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.BaseActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;

import java.util.ArrayList;
import java.util.List;

import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k5_2;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k5_3;

public class LivingRoomActivity extends BaseActivity{

    private static final String TAG = "LivingRoomActivity";

    private List<BaseButton> buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);


        initButtons();
        loadButtonsInBulk(buttons);

    }


    private void initButtons() {

        this.buttons = new ArrayList<>();

        BaseButton currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_1_1);
        currentButton.setOwner("p_oli_1");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_1);
        currentButton.setOwner("p_oli_k3");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k3b);
        currentButton.setOwner("p_oli_k3b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_2);
        currentButton.setOwner("p_oli_k3");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_1_2);
        currentButton.setOwner("p_oli_1_2");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_3);
        currentButton.setOwner("p_oli_k3");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_14);
        currentButton.setOwner("p_oli_14");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k2_1);
        currentButton.setOwner("p_oli_k2");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_10);
        currentButton.setOwner("p_oli_10");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_4);
        currentButton.setOwner("p_oli_4");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k2_2);
        currentButton.setOwner("p_oli_k2");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k2b);
        currentButton.setOwner("p_oli_k2b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_6);
        currentButton.setOwner("p_oli_6");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_kulso_1);
        currentButton.setOwner("p_oli_kulso");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_kulso_2);
        currentButton.setOwner("p_oli_kulso");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k5_1);
        currentButton.setOwner("p_oli_k5");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k5_2);
        currentButton.setOwner("p_oli_k5");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k5_3);
        currentButton.setOwner("p_oli_k5");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k1);
        currentButton.setOwner("p_oli_k1");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_18_1);
        currentButton.setOwner("p_oli_18");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_18_2);
        currentButton.setOwner("p_oli_18");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_17_1);
        currentButton.setOwner("p_oli_17");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_17_2);
        currentButton.setOwner("p_oli_17");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_40);
        currentButton.setOwner("p_oli_40");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_2);
        currentButton.setOwner("p_oli_2");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_11);
        currentButton.setOwner("p_oli_11");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_12);
        currentButton.setOwner("p_oli_12");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_13);
        currentButton.setOwner("p_oli_13");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_5);
        currentButton.setOwner("p_oli_5");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_7);
        currentButton.setOwner("p_oli_7");
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
        return UtilitiesActivity.class;
    }

    @Override
    public Class getActivityToTheRight() {
        return BedRoomActivity.class;
    }

    public void changeToBedroom(View view){
        Intent intent = new Intent(this, BedRoomActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }

    public void changeToGarage(View view){
        Intent intent = new Intent(this, GarageActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }

    public void changeToLivingroom(View view){
        Intent intent = new Intent(this, LivingRoomActivity.class);
        startActivity(intent);
    }

    public void changeToUpstairs(View view){
        Intent intent = new Intent(this, UpstairsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }

    public void changeToUtilities(View view){
        Intent intent = new Intent(this, UtilitiesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }
}