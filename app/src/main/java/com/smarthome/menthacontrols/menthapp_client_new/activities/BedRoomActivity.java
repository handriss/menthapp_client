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


public class BedRoomActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "BedRoomActivity";
    private List<BaseButton> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_room);

        initButtons();
        loadButtonsInBulk(buttons);
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

        BaseButton currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_24_1);
        currentButton.setOwner("p_oli_24");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_24_2);
        currentButton.setOwner("p_oli_24");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_25);
        currentButton.setOwner("p_oli_25");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k2b);
        currentButton.setOwner("p_oli_k2b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_26a);
        currentButton.setOwner("p_oli_26a");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_26b);
        currentButton.setOwner("p_oli_26b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_31);
        currentButton.setOwner("p_oli_31");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_27);
        currentButton.setOwner("p_oli_27");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k9);
        currentButton.setOwner("p_oli_k9");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_33);
        currentButton.setOwner("p_oli_33");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_30);
        currentButton.setOwner("p_oli_30");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_29);
        currentButton.setOwner("p_oli_29");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_1);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_2);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_3);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_4);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_5);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_6);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_7);
        currentButton.setOwner("p_oli_k8");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_39);
        currentButton.setOwner("p_oli_39");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_22);
        currentButton.setOwner("p_oli_22");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_23);
        currentButton.setOwner("p_oli_23");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_21);
        currentButton.setOwner("p_oli_21");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_38);
        currentButton.setOwner("p_oli_38");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_37);
        currentButton.setOwner("p_oli_37");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_35);
        currentButton.setOwner("p_oli_35");
        this.buttons.add(currentButton);

        currentButton = (FanWidgetButton) findViewById(R.id.p_ve1);
        currentButton.setOwner("p_oli_p_ve1");
        this.buttons.add(currentButton);

        currentButton = (FanWidgetButton) findViewById(R.id.p_ve2);
        currentButton.setOwner("p_oli_p_ve2");
        this.buttons.add(currentButton);


        for(Button button : buttons){
            button.setOnClickListener(this);
        }

    }

    public void changeToBedroom(View view){
        Intent intent = new Intent(this, BedRoomActivity.class);
        startActivity(intent);
    }

    public void changeToGarage(View view){
        Intent intent = new Intent(this, GarageActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);
    }

    public void changeToLivingroom(View view){
        Intent intent = new Intent(this, LivingRoomActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
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
