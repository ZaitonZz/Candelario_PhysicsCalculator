package com.example.candelario_physicscalculator.Controller;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.util.Log;
import android.widget.TextView;

public class CalculationRelated {
    public CalculationRelated(){}

    public void area_of_triangle(double base, double height, TextView text){
        double x = base * height * 0.5;
        text.setText("The Area is " + x);
        Log.d(TAG, "area_of_triangle: calculating triange");
    }
    public void area_of_rectangle(double length, double width, TextView text){
        double x = length * width;
        text.setText("The Area is " + x);
    }
    public void area_of_ellipse(double mAxis, double Maxis, TextView text){
        double x = mAxis* Maxis * Math.PI;
        text.setText("The Area is " + x);
    }
    public void area_of_trapezoid(double sbase, double lbase , double height, TextView text){
        double x = (sbase + lbase) * height * 0.5;
        text.setText("The Area is " + x);
    }
    public void area_of_circle(double radius, TextView text){
        double x = radius * radius * Math.PI;
        text.setText("The Area is " + x);
    }
    public void volume_of_cylinder(double radius, double height, TextView text){
        double x = radius * radius * height * Math.PI;
        text.setText("The Area is " + x);
    }
    public void volume_of_prism(double width, double height, double length, TextView text){
        double x = width * height * length * 0.5;
        text.setText("The Area is " + x);
    }
    public void volume_of_sphere(double radius, TextView text) {
        double x = radius * radius * radius * Math.PI*(4/3);
        text.setText("The Area is " + x);
    }
    public void volume_of_tetrahedron(double edge, TextView text) {
        double x = edge/(6*Math.sqrt(2));
        text.setText("The Area is " + x);
    }
    public void volume_of_ellipsoid(double mAxis, double Maxis, double vAxis, TextView text){
        double x = (4/3) *mAxis * Maxis * vAxis * Math.PI;
        text.setText("The Area is " + x);
        }
}
