package com.myappcompany.darshan.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    public void clickmeON(View view)
    {
        EditText weightText = (EditText)findViewById(R.id.weightText);

        double wi = Double.parseDouble(weightText.getText().toString());

        EditText heightText = (EditText)findViewById(R.id.heightText);

        double hi = Double.parseDouble(heightText.getText().toString());

        double bmi = wi/(hi*hi);

        Toast.makeText(this, "Your BMI is "+bmi, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
