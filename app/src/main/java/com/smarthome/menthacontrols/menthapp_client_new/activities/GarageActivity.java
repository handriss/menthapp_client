package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ButtonUpdater;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.TransferObject;

import java.util.ArrayList;
import java.util.List;

import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_10;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_40;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_41;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_42_1;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_42_2;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_42_3;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_42_4;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_43;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_44;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_45;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_46;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_7;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_8;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k10;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k12;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k7_1;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k7_2;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k7b_1;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_oli_k7b_2;
import static com.smarthome.menthacontrols.menthapp_client_new.R.id.p_ve3;


public class GarageActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "GarageActivity";

    private List<BaseButton> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        initButtons();
    }

    private BaseButton getButtonByName(String name){

        for(BaseButton button : this.buttons){
            if(name.equals(button.getOwner())){
                return button;
            }
        }
        return null;
    }

    private void loadButtonsInBulk(final List<BaseButton> buttons) {

        RequestSender.initializeButtonsInBulk(getApplicationContext(), new ButtonUpdater<List<TransferObject>>() {
            @Override
            public void updateStatus(List<TransferObject> transferObjects) {
                Log.d(TAG, "updateStatus: " + transferObjects.toString());
                for(TransferObject transferObject : transferObjects){
                    BaseButton button = getButtonByName(transferObject.getName());
                    Boolean status = transferObject.getWidgetStatus();

                    if(button != null){
                        if(status){
                            button.setButtonStatus(ButtonStatus.ON);
                        }
                    }
                }
            }
        });

    }

    private void initButtons() {

        this.buttons = new ArrayList<>();

        BaseButton currentButton = (WallLampWidgetButton) findViewById(p_oli_k12);
        currentButton.setOwner("p_oli_k12");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k7_1);
        currentButton.setOwner("p_oli_k7");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k7_2);
        currentButton.setOwner("p_oli_k7");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k7b_1);
        currentButton.setOwner("p_oli_k7b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_k7b_2);
        currentButton.setOwner("p_oli_k7b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_45);
        currentButton.setOwner("p_oli_45");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(p_oli_10);
        currentButton.setOwner("p_oli_10");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_42_1);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_42_2);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_42_3);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_42_4);
        currentButton.setOwner("p_oli_42");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_43);
        currentButton.setOwner("p_oli_43");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_41);
        currentButton.setOwner("p_oli_41");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_40);
        currentButton.setOwner("p_oli_40");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_44);
        currentButton.setOwner("p_oli_44");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_46);
        currentButton.setOwner("p_oli_46");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_8);
        currentButton.setOwner("p_oli_8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_7);
        currentButton.setOwner("p_oli_7");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(p_oli_k10);
        currentButton.setOwner("p_oli_k10");
        this.buttons.add(currentButton);

        currentButton = (FanWidgetButton) findViewById(p_ve3);
        currentButton.setOwner("p_ve3");
        this.buttons.add(currentButton);


        for(Button button : buttons){
            button.setOnClickListener(this);
        }

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

    @Override
    public void onClick(View view) {

        if(view instanceof BaseButton){
            BaseButton button = (BaseButton) view;
            button.toggleButton();
            RequestSender.setOneButtonsStatus(getApplicationContext(), button);
        }else{
            Log.d(TAG, "Unknown widget");
        }

    }
}
