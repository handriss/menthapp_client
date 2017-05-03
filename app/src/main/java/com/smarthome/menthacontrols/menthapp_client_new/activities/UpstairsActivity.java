package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.OpeningSensorWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.WallLampWidgetButton;


public class UpstairsActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "UpstairsActivity";

    WallLampWidgetButton p_oli_k102_1;
    WallLampWidgetButton p_oli_k102_2;
    WallLampWidgetButton p_oli_k101_1;
    WallLampWidgetButton p_oli_k101_2;
    WallLampWidgetButton p_oli_k101b_1;
    WallLampWidgetButton p_oli_k101b_2;
    WallLampWidgetButton p_oli_104;
    WallLampWidgetButton p_oli_112;
    WallLampWidgetButton p_oli_109;
    WallLampWidgetButton p_oli_107;
    WallLampWidgetButton p_oli_102;
    CeilingLampWidgetButton p_oli_113;
    CeilingLampWidgetButton p_oli_103;
    CeilingLampWidgetButton p_oli_108;
    CeilingLampWidgetButton p_oli_k110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upstairs);

        initButtons();
    }


    private void initButtons() {

        p_oli_k102_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k102_1);
        p_oli_k102_1.setOwner("p_oli_k102");
        p_oli_k102_1.setOnClickListener(this);

        p_oli_k102_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k102_2);
        p_oli_k102_2.setOwner("p_oli_k102");
        p_oli_k102_2.setOnClickListener(this);

        p_oli_k101_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k101_1);
        p_oli_k101_1.setOwner("p_oli_k101");
        p_oli_k101_1.setOnClickListener(this);

        p_oli_k101_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k101_2);
        p_oli_k101_2.setOwner("p_oli_k101");
        p_oli_k101_2.setOnClickListener(this);

        p_oli_k101b_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k101b_1);
        p_oli_k101b_1.setOwner("p_oli_k101b");
        p_oli_k101b_1.setOnClickListener(this);

        p_oli_k101b_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k101b_2);
        p_oli_k101b_2.setOwner("p_oli_k101b");
        p_oli_k101b_2.setOnClickListener(this);

        p_oli_104 = (WallLampWidgetButton) findViewById(R.id.p_oli_104);
//        p_oli_104.setOwner("p_oli_104");
        p_oli_104.setOnClickListener(this);

        p_oli_112 = (WallLampWidgetButton) findViewById(R.id.p_oli_112);
//        p_oli_112.setOwner("p_oli_112");
        p_oli_112.setOnClickListener(this);

        p_oli_109 = (WallLampWidgetButton) findViewById(R.id.p_oli_109);
        p_oli_109.setOwner("p_oli_109");
        p_oli_109.setOnClickListener(this);

        p_oli_107 = (WallLampWidgetButton) findViewById(R.id.p_oli_107);
//        p_oli_107.setOwner("p_oli_107");
        p_oli_107.setOnClickListener(this);

        p_oli_102 = (WallLampWidgetButton) findViewById(R.id.p_oli_102);
//        p_oli_102.setOwner("p_oli_102");
        p_oli_102.setOnClickListener(this);

        p_oli_113 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_113);
//        p_oli_113.setOwner("p_oli_113");
        p_oli_113.setOnClickListener(this);

        p_oli_103 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_103);
//        p_oli_103.setOwner("p_oli_103");
        p_oli_103.setOnClickListener(this);

        p_oli_108 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_108);
//        p_oli_108.setOwner("p_oli_108");
        p_oli_108.setOnClickListener(this);

        p_oli_k110 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k110);
//        p_oli_k110.setOwner("p_oli_k110");
        p_oli_k110.setOnClickListener(this);

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
