package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.OpeningSensorWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.button_subtypes.WallLampWidgetButton;


public class BedRoomActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "BedRoomActivity";

    WallLampWidgetButton p_oli_24_1;
    WallLampWidgetButton p_oli_24_2;
    WallLampWidgetButton p_oli_25;
    WallLampWidgetButton p_oli_k2b;
    WallLampWidgetButton p_oli_26a;
    WallLampWidgetButton p_oli_26b;
    WallLampWidgetButton p_oli_31;
    WallLampWidgetButton p_oli_27;
    WallLampWidgetButton p_oli_k9;
    WallLampWidgetButton p_oli_36;

    CeilingLampWidgetButton p_oli_33;
    CeilingLampWidgetButton p_oli_30;
    CeilingLampWidgetButton p_oli_29;
    CeilingLampWidgetButton p_oli_k8_1;
    CeilingLampWidgetButton p_oli_k8_2;
    CeilingLampWidgetButton p_oli_k8_3;
    CeilingLampWidgetButton p_oli_k8_4;
    CeilingLampWidgetButton p_oli_k8_5;
    CeilingLampWidgetButton p_oli_k8_6;
    CeilingLampWidgetButton p_oli_k8_7;
    CeilingLampWidgetButton p_oli_39;
    CeilingLampWidgetButton p_oli_22;
    CeilingLampWidgetButton p_oli_23;
    CeilingLampWidgetButton p_oli_21;
    CeilingLampWidgetButton p_oli_38;
    CeilingLampWidgetButton p_oli_37;
    CeilingLampWidgetButton p_oli_35;

    FanWidgetButton p_ve1;
    FanWidgetButton p_ve2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_room);

        initButtons();
    }

    private void initButtons() {

        p_oli_24_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_24_1);
        p_oli_24_1.setOwner("p_oli_24");
        p_oli_24_1.setOnClickListener(this);

        p_oli_24_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_24_2);
        p_oli_24_2.setOwner("p_oli_24");
        p_oli_24_2.setOnClickListener(this);

        p_oli_25 = (WallLampWidgetButton) findViewById(R.id.p_oli_25);
//        p_oli_25.setOwner("p_oli_25");
        p_oli_25.setOnClickListener(this);

        p_oli_k2b = (WallLampWidgetButton) findViewById(R.id.p_oli_k2b);
//        p_oli_k2b.setOwner("p_oli_k2b");
        p_oli_k2b.setOnClickListener(this);

        p_oli_26a = (WallLampWidgetButton) findViewById(R.id.p_oli_26a);
//        p_oli_26a.setOwner("p_oli_26a");
        p_oli_26a.setOnClickListener(this);

        p_oli_26b = (WallLampWidgetButton) findViewById(R.id.p_oli_26b);
//        p_oli_26b.setOwner("p_oli_26b");
        p_oli_26b.setOnClickListener(this);

        p_oli_31 = (WallLampWidgetButton) findViewById(R.id.p_oli_31);
//        p_oli_31.setOwner("p_oli_31");
        p_oli_31.setOnClickListener(this);

        p_oli_27 = (WallLampWidgetButton) findViewById(R.id.p_oli_27);
//        p_oli_27.setOwner("p_oli_27");
        p_oli_27.setOnClickListener(this);

        p_oli_k9 = (WallLampWidgetButton) findViewById(R.id.p_oli_k9);
//        p_oli_k9.setOwner("p_oli_k9");
        p_oli_k9.setOnClickListener(this);

        p_oli_36 = (WallLampWidgetButton) findViewById(R.id.p_oli_k9);
//        p_oli_k9.setOwner("p_oli_k9");
        p_oli_k9.setOnClickListener(this);


        p_oli_33 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_33);
//        p_oli_33.setOwner("p_oli_33");
        p_oli_33.setOnClickListener(this);

        p_oli_30 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_30);
//        p_oli_30.setOwner("p_oli_30");
        p_oli_30.setOnClickListener(this);

        p_oli_29 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_29);
//        p_oli_29.setOwner("p_oli_29");
        p_oli_29.setOnClickListener(this);

        p_oli_k8_1 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_1);
        p_oli_k8_1.setOwner("p_oli_k8");
        p_oli_k8_1.setOnClickListener(this);

        p_oli_k8_2 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_2);
        p_oli_k8_2.setOwner("p_oli_k8");
        p_oli_k8_2.setOnClickListener(this);

        p_oli_k8_3 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_3);
        p_oli_k8_3.setOwner("p_oli_k8");
        p_oli_k8_3.setOnClickListener(this);

        p_oli_k8_4 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_4);
        p_oli_k8_4.setOwner("p_oli_k8");
        p_oli_k8_4.setOnClickListener(this);

        p_oli_k8_5 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_5);
        p_oli_k8_5.setOwner("p_oli_k8");
        p_oli_k8_5.setOnClickListener(this);

        p_oli_k8_6 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_6);
        p_oli_k8_6.setOwner("p_oli_k8");
        p_oli_k8_6.setOnClickListener(this);

        p_oli_k8_7 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k8_7);
        p_oli_k8_7.setOwner("p_oli_k8");
        p_oli_k8_7.setOnClickListener(this);

        p_oli_39 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_39);
//        p_oli_39.setOwner("p_oli_39");
        p_oli_39.setOnClickListener(this);

        p_oli_22 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_22);
//        p_oli_22.setOwner("p_oli_22");
        p_oli_22.setOnClickListener(this);

        p_oli_23 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_23);
//        p_oli_23.setOwner("p_oli_23");
        p_oli_23.setOnClickListener(this);

        p_oli_21 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_21);
//        p_oli_21.setOwner("p_oli_21");
        p_oli_21.setOnClickListener(this);

        p_oli_38 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_38);
//        p_oli_38.setOwner("p_oli_38");
        p_oli_38.setOnClickListener(this);

        p_oli_37 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_37);
//        p_oli_37.setOwner("p_oli_37");
        p_oli_37.setOnClickListener(this);

        p_oli_35 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_35);
//        p_oli_35.setOwner("p_oli_35");
        p_oli_35.setOnClickListener(this);

        p_ve1 = (FanWidgetButton) findViewById(R.id.p_ve1);
//        p_ve1.setOwner("p_ve1");
        p_ve1.setOnClickListener(this);


        p_ve2 = (FanWidgetButton) findViewById(R.id.p_ve2);
//        p_ve2.setOwner("p_ve2");
        p_ve2.setOnClickListener(this);


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
