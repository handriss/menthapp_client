package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.OpeningSensorWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.WallLampWidgetButton;

import java.util.ArrayList;
import java.util.List;


public class LivingRoomActivity extends AppCompatActivity implements View.OnClickListener{

//    ide kéne egy list az összes buttonról és az activitynek kéne implementálnia a OnDownloadCompleteHandler-t
//    és ha kész, akkor a list alapján updatelnie a buttonokat

    private static final String TAG = "LivingRoomActivity";

    WallLampWidgetButton btnFirst;
    CeilingLampWidgetButton btnSecond;
    FanWidgetButton btnThird;
    OpeningSensorWidgetButton btnFourth;

    private List<Button> buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();

    }

    private void initButtons() {

        this.buttons = new ArrayList<>();

        this.buttons.add((WallLampWidgetButton) findViewById(R.id.btnFirst));
        this.buttons.add((WallLampWidgetButton) findViewById(R.id.btnSecond));

        for(Button button : buttons){
            button.setOnClickListener(this);
        }
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

    @Override
    public void onClick(View view) {


        if(view instanceof WallLampWidgetButton){
            WallLampWidgetButton button = (WallLampWidgetButton) view;
            button.toggleButton();

        }else if(view instanceof CeilingLampWidgetButton){
            CeilingLampWidgetButton button = (CeilingLampWidgetButton) view;
            button.toggleButton();

        }else if(view instanceof FanWidgetButton){
            FanWidgetButton button = (FanWidgetButton) view;
            button.toggleButton();

        }else if(view instanceof OpeningSensorWidgetButton){
            OpeningSensorWidgetButton button = (OpeningSensorWidgetButton) view;

        }else{
            Log.d(TAG, "Unknown widget");
        }

    }
}