package com.example.candelario_physicscalculator.View.Volume;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.candelario_physicscalculator.Controller.CalculationRelated;
import com.example.candelario_physicscalculator.Model.VariableRelated;
import com.example.candelario_physicscalculator.R;

public class V_FragmentFive extends Fragment {

    Button button;
    EditText var1, var2, var3;
    TextView result;
    CalculationRelated calc;
    VariableRelated var;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.volume_fragment_five, container, false);
        button = rootView.findViewById(R.id.calc);
        var1 = rootView.findViewById(R.id.var1);
        var2 = rootView.findViewById(R.id.var2);
        var3 = rootView.findViewById(R.id.var3);
        result = rootView.findViewById(R.id.answer);
        calc = new CalculationRelated();
        var = new VariableRelated();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: working1");
                try {
                    var.setVolume_minor_axis(Double.parseDouble(var1.getText().toString()));
                } catch (NumberFormatException e) {

                }
                try {
                    var.setVolume_major_axis(Double.parseDouble(var2.getText().toString()));
                } catch (NumberFormatException e) {

                }
                try {
                    var.setVolume_vertical_axis(Double.parseDouble(var3.getText().toString()));
                } catch (NumberFormatException e) {

                }
                calc.volume_of_ellipsoid(var.getVolume_minor_axis(),var.getVolume_major_axis(),var.getVolume_vertical_axis(),result);
            }
        });

        return rootView;
    }
}
