package com.smarthome.menthacontrols.menthapp_client_new.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.ColoredButton;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestHandler;


public class LivingRoomActivity extends AppCompatActivity implements View.OnClickListener {

    ColoredButton btnRed;
    ColoredButton btnGreen;
    Button btnSwitch;

    boolean switched = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestHandler handler = new RequestHandler(this);

        initButtons();

    }

    private void initButtons() {
        btnRed = (ColoredButton) findViewById(R.id.btnRed);
        btnGreen = (ColoredButton) findViewById(R.id.btnGreen);

        btnRed.setIsRed(true);
        btnGreen.setIsRed(false);

        btnSwitch = (Button) findViewById(R.id.btnSwitch);
        btnSwitch.setOnClickListener(this);
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
    public void onClick(View v) {
        btnRed.setIsRed(switched);
        btnGreen.setIsRed(!switched);

        switched = !switched;
    }
}