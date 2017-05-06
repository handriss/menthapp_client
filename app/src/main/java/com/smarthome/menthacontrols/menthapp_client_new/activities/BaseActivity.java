package com.smarthome.menthacontrols.menthapp_client_new.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.smarthome.menthacontrols.menthapp_client_new.R;
import com.smarthome.menthacontrols.menthapp_client_new.model.BaseButton;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.ButtonStatus;
import com.smarthome.menthacontrols.menthapp_client_new.request.ConnectionChecker;
import com.smarthome.menthacontrols.menthapp_client_new.request.RequestSender;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.ViewUpdater;
import com.smarthome.menthacontrols.menthapp_client_new.request.request_helpers.TransferObject;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "BaseActivity";

    protected final int MIN_DISTANCE = 150;
    protected float x1;
    protected float x2;

    public abstract List<BaseButton> getButtons();
    public abstract Class getActivityToTheLeft();
    public abstract Class getActivityToTheRight();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConnectionChecker connectionChecker = new ConnectionChecker(getApplicationContext());
        connectionChecker.refreshConnectionStatus();
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

                if (Math.abs(deltaX) > this.MIN_DISTANCE) {
                    if (x2 > x1) {
//                        Toast.makeText(this, "Left to Right swipe [Next]", Toast.LENGTH_SHORT).show ();
                        this.changeToActivityToTheLeft();
                    }

                    else {
//                        Toast.makeText(this, "Right to Left swipe [Previous]", Toast.LENGTH_SHORT).show ();
                        this.changeToActivityToTheRight();
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
            List<BaseButton> buttons = getAllButtonsByName(button.getOwner());

            for(BaseButton currentButton : buttons){
                currentButton.toggleButton();
            }

            RequestSender.setOneButtonsStatus(getApplicationContext(), button);
        }else{
            Log.d(TAG, "Unknown widget");
        }

    }

    protected void loadButtonsInBulk(final List<BaseButton> buttons) {

        RequestSender.initializeButtonsInBulk(getApplicationContext(), new ViewUpdater<List<TransferObject>>() {
            @Override
            public void updateStatus(List<TransferObject> transferObjects) {

                for(TransferObject transferObject : transferObjects){

                    Boolean currentButtonsStatus = transferObject.getWidgetStatus();
                    List<BaseButton> buttons = getAllButtonsByName(transferObject.getName());
                    for(BaseButton button : buttons){
                        if(currentButtonsStatus){
                            button.setButtonStatus(ButtonStatus.ON);
                        }
                    }

                }
            }
        });


    }

    private List<BaseButton> getAllButtonsByName(String name){

        List<BaseButton> buttonsByName = new ArrayList<>();

        for(BaseButton button : this.getButtons()){
            if(name.equals(button.getOwner())){
                buttonsByName.add(button);
            }
        }
        return buttonsByName;
    }

    public void changeToActivityToTheRight(){
        Intent intent = new Intent(this, this.getActivityToTheRight());
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.leave_right_to_left);

    }


    public void changeToActivityToTheLeft(){
        Intent intent = new Intent(this, this.getActivityToTheLeft());
        startActivity(intent);
        overridePendingTransition(R.anim.leave_left_to_right, R.anim.enter_left_to_right);


    }

}
