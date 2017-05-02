package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.OpeningSensorWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.buttons.WallLampWidgetButton;


public class LivingRoomActivity extends AppCompatActivity implements View.OnClickListener{

//    ide kéne egy list az összes buttonról és az activitynek kéne implementálnia a OnDownloadCompleteHandler-t
//    és ha kész, akkor a list alapján updatelnie a buttonokat

    private static final String TAG = "LivingRoomActivity";

    WallLampWidgetButton p_oli_k3_1;
    WallLampWidgetButton p_oli_k3_2;
    WallLampWidgetButton p_oli_k3b;
    WallLampWidgetButton p_oli_1_1;
    WallLampWidgetButton p_oli_1_2;
    WallLampWidgetButton p_oli_k3_3;
    WallLampWidgetButton p_oli_14;
    WallLampWidgetButton p_oli_k2_1;
    WallLampWidgetButton p_oli_10;
    WallLampWidgetButton p_oli_4;
    WallLampWidgetButton p_oli_k2_2;
    WallLampWidgetButton p_oli_k2b;
    WallLampWidgetButton p_oli_6;
    WallLampWidgetButton p_oli_kulso_1;
    WallLampWidgetButton p_oli_kulso_2;
    WallLampWidgetButton p_oli_k5_1;
    WallLampWidgetButton p_oli_k5_2;
    WallLampWidgetButton p_oli_k5_3;

    CeilingLampWidgetButton p_oli_k1;
    CeilingLampWidgetButton p_oli_18_1;
    CeilingLampWidgetButton p_oli_18_2;
    CeilingLampWidgetButton p_oli_17_1;
    CeilingLampWidgetButton p_oli_17_2;
    CeilingLampWidgetButton p_oli_40;
    CeilingLampWidgetButton p_oli_2;
    CeilingLampWidgetButton p_oli_11;
    CeilingLampWidgetButton p_oli_5;
    CeilingLampWidgetButton p_oli_12;
    CeilingLampWidgetButton p_oli_13;
    CeilingLampWidgetButton p_oli_7;

    FanWidgetButton p_ve3;

//    OpeningSensorWidgetButton btnFourth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);

        initButtons();

//        RequestSender requestSender = new RequestSender(btnFirst);
//        requestSender.execute("http://mcss.blue:8080/widget/p_oli_21");

//        RequestSender requestSender = new RequestSender();
    }

    private void initButtons() {

        p_oli_1_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_1_1);
        p_oli_1_1.setOwner("p_oli_1");
        p_oli_1_1.setOnClickListener(this);

        p_oli_k3_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_1);
        p_oli_k3_1.setOwner("p_oli_k3");
        p_oli_k3_1.setOnClickListener(this);

        p_oli_k3b = (WallLampWidgetButton) findViewById(R.id.p_oli_k3b);
//        p_oli_k3b.setOwner("p_oli_k3b");
        p_oli_k3b.setOnClickListener(this);

        p_oli_k3_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_2);
        p_oli_k3_2.setOwner("p_oli_k3");
        p_oli_k3_2.setOnClickListener(this);

        p_oli_1_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_1_2);
        p_oli_1_2.setOwner("p_oli_1");
        p_oli_1_2.setOnClickListener(this);

        p_oli_k3_3 = (WallLampWidgetButton) findViewById(R.id.p_oli_k3_3);
        p_oli_k3_3.setOwner("p_oli_k3");
        p_oli_k3_3.setOnClickListener(this);

        p_oli_14 = (WallLampWidgetButton) findViewById(R.id.p_oli_14);
//        p_oli_14.setOwner("p_oli_14");
        p_oli_14.setOnClickListener(this);

        p_oli_k2_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k2_1);
        p_oli_k2_1.setOwner("p_oli_k2");
        p_oli_k2_1.setOnClickListener(this);

        p_oli_10 = (WallLampWidgetButton) findViewById(R.id.p_oli_10);
//        p_oli_10.setOwner("p_oli_10");
        p_oli_10.setOnClickListener(this);

        p_oli_4 = (WallLampWidgetButton) findViewById(R.id.p_oli_4);
//        p_oli_4.setOwner("p_oli_4");
        p_oli_4.setOnClickListener(this);


        p_oli_k2_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k2_2);
        p_oli_k2_2.setOwner("p_oli_k2");
        p_oli_k2_2.setOnClickListener(this);


        p_oli_k2b = (WallLampWidgetButton) findViewById(R.id.p_oli_k2b);
//        p_oli_k2b.setOwner("p_oli_k2b");
        p_oli_k2b.setOnClickListener(this);


        p_oli_6 = (WallLampWidgetButton) findViewById(R.id.p_oli_6);
//        p_oli_6.setOwner("p_oli_6");
        p_oli_6.setOnClickListener(this);


        p_oli_kulso_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_kulso_1);
        p_oli_kulso_1.setOwner("p_oli_kulso");
        p_oli_kulso_1.setOnClickListener(this);


        p_oli_kulso_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_kulso_2);
        p_oli_kulso_2.setOwner("p_oli_kulso");
        p_oli_kulso_2.setOnClickListener(this);


        p_oli_k5_1 = (WallLampWidgetButton) findViewById(R.id.p_oli_k5_1);
        p_oli_k5_1.setOwner("p_oli_k5");
        p_oli_k5_1.setOnClickListener(this);


        p_oli_k5_2 = (WallLampWidgetButton) findViewById(R.id.p_oli_k5_2);
        p_oli_k5_2.setOwner("p_oli_k5");
        p_oli_k5_2.setOnClickListener(this);


        p_oli_k5_3 = (WallLampWidgetButton) findViewById(R.id.p_oli_k5_3);
        p_oli_k5_3.setOwner("p_oli_k5");
        p_oli_k5_3.setOnClickListener(this);


        p_oli_k1 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_k1);
//        p_oli_k1.setOwner("p_oli_k1");
        p_oli_k1.setOnClickListener(this);

        p_oli_18_1 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_18_1);
        p_oli_18_1.setOwner("p_oli_18");
        p_oli_18_1.setOnClickListener(this);

        p_oli_18_2 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_18_2);
        p_oli_18_2.setOwner("p_oli_18");
        p_oli_18_2.setOnClickListener(this);

        p_oli_17_1 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_17_1);
        p_oli_17_1.setOwner("p_oli_17");
        p_oli_17_1.setOnClickListener(this);

        p_oli_17_2 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_17_2);
        p_oli_17_2.setOwner("p_oli_17");
        p_oli_17_2.setOnClickListener(this);

        p_oli_40 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_40);
//        p_oli_40.setOwner("p_oli_40");
        p_oli_40.setOnClickListener(this);

        p_oli_2 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_2);
//        p_oli_2.setOwner("p_oli_2");
        p_oli_2.setOnClickListener(this);

        p_oli_11 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_11);
//        p_oli_11.setOwner("p_oli_11");
        p_oli_11.setOnClickListener(this);

        p_oli_5 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_5);
//        p_oli_5.setOwner("p_oli_5");
        p_oli_5.setOnClickListener(this);

        p_oli_12 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_12);
//        p_oli_12.setOwner("p_oli_12");
        p_oli_12.setOnClickListener(this);

        p_oli_13 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_13);
//        p_oli_13.setOwner("p_oli_13");
        p_oli_13.setOnClickListener(this);

        p_oli_7 = (CeilingLampWidgetButton) findViewById(R.id.p_oli_7);
//        p_oli_7.setOwner("p_oli_7");
        p_oli_7.setOnClickListener(this);

        p_ve3 = (FanWidgetButton) findViewById(R.id.p_ve3);
//        p_ve3.setOwner("p_ve3");
        p_ve3.setOnClickListener(this);

//        btnFourth = (OpeningSensorWidgetButton) findViewById(R.id.btnFourth);
//        btnFourth.setOnClickListener(this);

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