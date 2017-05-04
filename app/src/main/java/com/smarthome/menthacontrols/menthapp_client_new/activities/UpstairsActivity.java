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
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ButtonUpdater;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.TransferObject;

import java.util.ArrayList;
import java.util.List;


public class UpstairsActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "UpstairsActivity";

    private List<BaseButton> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upstairs);

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

        BaseButton currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k102_1);
        currentButton.setOwner("p_oli_k102");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k102_2);
        currentButton.setOwner("p_oli_p_oli_k102");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k101_1);
        currentButton.setOwner("p_oli_k101");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k101_2);
        currentButton.setOwner("p_oli_k101");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k101b_1);
        currentButton.setOwner("p_oli_k101b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_k101b_2);
        currentButton.setOwner("p_oli_k101b");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_104);
        currentButton.setOwner("p_oli_104");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_112);
        currentButton.setOwner("p_oli_112");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_109);
        currentButton.setOwner("p_oli_109");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_107);
        currentButton.setOwner("p_oli_107");
        this.buttons.add(currentButton);

        currentButton = (WallLampWidgetButton) findViewById(R.id.p_oli_102);
        currentButton.setOwner("p_oli_102");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_113);
        currentButton.setOwner("p_oli_113");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_103);
        currentButton.setOwner("p_oli_103");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_108);
        currentButton.setOwner("p_oli_108");
        this.buttons.add(currentButton);

        currentButton = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k110);
        currentButton.setOwner("p_oli_k110");
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
