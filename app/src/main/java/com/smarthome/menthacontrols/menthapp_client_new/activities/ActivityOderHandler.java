package com.smarthome.menthacontrols.menthapp_client_new.activities;


import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.BedRoomActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.GarageActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.LivingRoomActivity;
import com.smarthome.menthacontrols.menthapp_client_new.activities.subactivities.UpstairsActivity;

import java.util.ArrayList;

public final class ActivityOderHandler {

    private ArrayList<Class> activities = new ArrayList<>();

    public ActivityOderHandler() {
        this.activities.add(LivingRoomActivity.class);
        this.activities.add(BedRoomActivity.class);
        this.activities.add(UpstairsActivity.class);
        this.activities.add(GarageActivity.class);
        this.activities.add(UpstairsActivity.class);
    }

    public Class getActivityToTheRight(Class currentActivity){
        int currentActivitiesIndex = this.activities.indexOf(currentActivity);
        if(currentActivitiesIndex != this.activities.size()){
            return this.activities.get(currentActivitiesIndex + 1);
        }else{
            return this.activities.get(0);
        }
    }

    public Class getActivityToTheLeft(Class currentActivity){
        int currentActivitiesIndex = this.activities.indexOf(currentActivity);
        if(currentActivitiesIndex != 0){
            return this.activities.get(currentActivitiesIndex - 1);
        }else{
            return this.activities.get(this.activities.size());

        }
    }
}
