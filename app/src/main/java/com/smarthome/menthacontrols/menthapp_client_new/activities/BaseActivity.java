package com.smarthome.menthacontrols.menthapp_client_new.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.BedRoomActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.GarageActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.LivingRoomActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.UpstairsActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.UtilitiesActivity;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ButtonUpdater;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.TransferObject;

import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "BaseActivity";

    protected final int MIN_DISTANCE = 150;
    protected float x1;
    protected float x2;
    private ActivityOderHandler activityOrderHandler = new ActivityOderHandler();

    public abstract List<BaseButton> getButtons();

    @Override
    public boolean onTouchEvent(MotionEvent event){

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;

                if (Math.abs(deltaX) > this.MIN_DISTANCE) {
                    if (x2 > x1) {
                        Toast.makeText(this, "Left to Right swipe [Next]", Toast.LENGTH_SHORT).show ();
                        this.changeToActivityToTheRight();
                    }

                    else {
                        Toast.makeText(this, "Right to Left swipe [Previous]", Toast.LENGTH_SHORT).show ();
                        this.changeToActivityToTheLeft();
                    }

                }
                break;
        }
        return super.onTouchEvent(event);
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

    protected void loadButtonsInBulk(final List<BaseButton> buttons) {

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

    private BaseButton getButtonByName(String name){

        for(BaseButton button : this.getButtons()){
            if(name.equals(button.getOwner())){
                return button;
            }
        }
        return null;
    }


    public void changeToActivityToTheRight(){
        Intent intent = new Intent(this, activityOrderHandler.getActivityToTheRight(this.getClass()));
        startActivity(intent);
    }


    public void changeToActivityToTheLeft(){
        Intent intent = new Intent(this, activityOrderHandler.getActivityToTheLeft(this.getClass()));
        startActivity(intent);
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

}
