package com.example.candelario_physicscalculator.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.candelario_physicscalculator.Controller.AppRelated;
import com.example.candelario_physicscalculator.R;

public class ChoosingScreen extends AppCompatActivity implements View.OnClickListener {
    Button btn_a, btn_v;
    AppRelated controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_screen);
        btn_a = (Button) findViewById(R.id.areas_btn);
        btn_v = (Button) findViewById(R.id.volume_btn);
        btn_a.setOnClickListener(this);
        btn_v.setOnClickListener(this);
        controller= new AppRelated();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.areas_btn:
                controller.teleportArea(this);
                break;
            case R.id.volume_btn:
                controller.teleportVolume(this);
                break;
        }
    }
}