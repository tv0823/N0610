package com.example.n0610;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sW;
    ToggleButton tB;
    ConstraintLayout cL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sW = findViewById(R.id.sW);
        tB = findViewById(R.id.tB);
        cL = findViewById(R.id.cL);
    }

    public void pressed(View view) {
        if(sW.isChecked() && tB.isChecked())
            cL.setBackgroundColor(Color.BLUE);
        else if(sW.isChecked() && !tB.isChecked())
            cL.setBackgroundColor(Color.GREEN);
        else if(!sW.isChecked() && tB.isChecked())
            cL.setBackgroundColor(Color.YELLOW);
        else
            cL.setBackgroundColor(Color.LTGRAY);
    }
}