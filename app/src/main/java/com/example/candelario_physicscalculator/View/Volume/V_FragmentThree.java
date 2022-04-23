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

public class V_FragmentThree extends Fragment {

    Button button;
    EditText var1;
    TextView result;
    CalculationRelated calc;
    VariableRelated var;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.volume_fragment_three, container, false);
        button = rootView.findViewById(R.id.calc);
        var1 = rootView.findViewById(R.id.var1);
        result = rootView.findViewById(R.id.answer);
        calc = new CalculationRelated();
        var = new VariableRelated();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: working1");
                try {
                    var.setVolume_radius(Double.parseDouble(var1.getText().toString()));
                } catch (NumberFormatException e) {

                }
                calc.volume_of_sphere(var.getVolume_radius(),result);
            }
        });

        return rootView;
    }
}
