package com.smarthome.menthacontrols.menthapp_client_new.activities;


import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    protected final int MIN_DISTANCE = 150;

    protected float x1;
    protected float x2;

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
