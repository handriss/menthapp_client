package com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.BaseActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;

import java.util.List;


public class UtilitiesActivity extends BaseActivity {

    private static final String TAG = "UtilitiesActivity";
    private List<BaseButton> buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities);
    }


    @Override
    public List<BaseButton> getButtons() {
        return this.buttons;
    }

    @Override
    public Class getActivityToTheLeft() {
        return GarageActivity.class;
    }

    @Override
    public Class getActivityToTheRight() {
        return LivingRoomActivity.class;
    }

    public void changeToBedroom(View view){
        Intent intent = new Intent(this, BedRoomActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
    }

    public void changeToGarage(View view){
        Intent intent = new Intent(this, GarageActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);
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
    }
}
