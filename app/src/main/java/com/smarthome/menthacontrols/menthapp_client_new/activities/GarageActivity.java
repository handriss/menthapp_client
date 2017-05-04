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


public class GarageActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "GarageActivity";

    WallLampWidgetButton p_oli_k12;
    WallLampWidgetButton p_oli_k7_1;
    WallLampWidgetButton p_oli_k7_2;
    WallLampWidgetButton p_oli_k7b_1;
    WallLampWidgetButton p_oli_k7b_2;
    WallLampWidgetButton p_oli_45;
    WallLampWidgetButton p_oli_10;

    CeilingLampWidgetButton p_oli_42_1;
    CeilingLampWidgetButton p_oli_42_2;
    CeilingLampWidgetButton p_oli_42_3;
    CeilingLampWidgetButton p_oli_42_4;
    CeilingLampWidgetButton p_oli_43;
    CeilingLampWidgetButton p_oli_41;
    CeilingLampWidgetButton p_oli_40;
    CeilingLampWidgetButton p_oli_44;
    CeilingLampWidgetButton p_oli_46;
    CeilingLampWidgetButton p_oli_8;
    CeilingLampWidgetButton p_oli_7;
    CeilingLampWidgetButton p_oli_k10;

    FanWidgetButton p_ve3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        initButtons();
    }

    private void initButtons() {

        p_oli_k12 = (WallLampWidgetButton) findViewById(R.id.p_oli_k12);
//        p_oli_k12.setOwner("p_oli_k12");
        p_oli_k12.setOnClickListener(this);

        p_oli_k7_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k7_1);
        p_oli_k7_1.setOwner("p_oli_k7");
        p_oli_k7_1.setOnClickListener(this);

        p_oli_k7_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k7_2);
        p_oli_k7_2.setOwner("p_oli_k7");
        p_oli_k7_2.setOnClickListener(this);

        p_oli_k7b_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k7b_1);
        p_oli_k7b_1.setOwner("p_oli_k7b");
        p_oli_k7b_1.setOnClickListener(this);

        p_oli_k7b_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k7b_2);
        p_oli_k7b_2.setOwner("p_oli_k7b");
        p_oli_k7b_2.setOnClickListener(this);

        p_oli_45 = (WallLampWidgetButton) findViewById(R.id.p_oli_45);
//        p_oli_45.setOwner("p_oli_45");
        p_oli_45.setOnClickListener(this);

        p_oli_10 = (WallLampWidgetButton) findViewById(R.id.p_oli_10);
//        p_oli_10.setOwner("p_oli_10");
        p_oli_10.setOnClickListener(this);

        p_oli_42_1 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_1);
//        p_oli_42_1.setOwner("p_oli_42_1");
        p_oli_42_1.setOnClickListener(this);

        p_oli_42_2 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_2);
//        p_oli_42_2.setOwner("p_oli_42_2");
        p_oli_42_2.setOnClickListener(this);

        p_oli_42_3 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_3);
//        p_oli_42_3.setOwner("p_oli_42_3");
        p_oli_42_3.setOnClickListener(this);

        p_oli_42_4 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_42_4);
//        p_oli_42_4.setOwner("p_oli_42_4");
        p_oli_42_4.setOnClickListener(this);

        p_oli_43 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_43);
//        p_oli_43.setOwner("p_oli_43");
        p_oli_43.setOnClickListener(this);

        p_oli_41 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_41);
//        p_oli_41.setOwner("p_oli_41");
        p_oli_41.setOnClickListener(this);

        p_oli_40 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_40);
//        p_oli_40.setOwner("p_oli_40");
        p_oli_40.setOnClickListener(this);

        p_oli_44 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_44);
//        p_oli_44.setOwner("p_oli_44");
        p_oli_44.setOnClickListener(this);

        p_oli_46 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_46);
//        p_oli_46.setOwner("p_oli_46");
        p_oli_46.setOnClickListener(this);

        p_oli_8 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_8);
//        p_oli_8.setOwner("p_oli_8");
        p_oli_8.setOnClickListener(this);

        p_oli_7 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_7);
//        p_oli_7.setOwner("p_oli_7");
        p_oli_7.setOnClickListener(this);

        p_oli_k10 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k10);
//        p_oli_k10.setOwner("p_oli_k10");
        p_oli_k10.setOnClickListener(this);


        p_ve3 = (FanWidgetButton) findViewById(R.id.p_ve3);
//        p_ve3.setOwner("p_ve3");
        p_ve3.setOnClickListener(this);

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
