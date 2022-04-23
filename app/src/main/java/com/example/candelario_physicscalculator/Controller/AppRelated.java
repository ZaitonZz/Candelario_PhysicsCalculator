package com.example.candelario_physicscalculator.Controller;

import android.content.Context;
import android.content.Intent;

import com.example.candelario_physicscalculator.View.Area.AreaActivity;
import com.example.candelario_physicscalculator.View.Volume.VolumeActivity;

public class AppRelated {
    public AppRelated(){}
    public void teleportArea(Context context){
        context.startActivity(new Intent(context, AreaActivity.class));
    }
    public void teleportVolume(Context context){
        context.startActivity(new Intent(context, VolumeActivity.class));
    }
}
