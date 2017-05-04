package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.CeilingLampWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.FanWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.OpeningSensorWidgetButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.WallLampWidgetButton;


public class LivingRoomActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LivingRoomActivity";

    private float x1,x2;
    static final int MIN_DISTANCE = 150;


    WallLampWidgetButton btnFirst;
    CeilingLampWidgetButton btnSecond;
    FanWidgetButton btnThird;
    OpeningSensorWidgetButton btnFourth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initButtons();

    }

    private void initButtons() {

        btnFirst = (WallLampWidgetButton) findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(this);

        btnSecond = (CeilingLampWidgetButton) findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(this);

        btnThird = (FanWidgetButton) findViewById(R.id.btnThird);
        btnThird.setOnClickListener(this);

        btnFourth = (OpeningSensorWidgetButton) findViewById(R.id.btnFourth);
        btnFourth.setOnClickListener(this);

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
    public void onClick(View view){


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


    @Override
    public boolean onTouchEvent(MotionEvent event){

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;

                if (Math.abs(deltaX) > MIN_DISTANCE) {
                    if (x2 > x1) {
                        Toast.makeText(this, "Left to Right swipe [Next]", Toast.LENGTH_SHORT).show ();
                    }

                    else {
                        Toast.makeText(this, "Right to Left swipe [Previous]", Toast.LENGTH_SHORT).show ();
                    }

                }
                break;
        }
        return super.onTouchEvent(event);
    }
}