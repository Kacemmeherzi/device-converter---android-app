package com.example.conversion3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Commencer la conversion ",Toast.LENGTH_LONG).show();

        Button myButton = findViewById(R.id.buttonc);
        myButton.setBackgroundColor(Color.RED);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Convertir(v);
            }
        });
    }


    public void Convertir(View v){



        RadioButton radio1=(RadioButton) findViewById(R.id.rb1);
        RadioButton radio2=(RadioButton) findViewById(R.id.rb2);
        EditText edt = (EditText) findViewById(R.id.edit_float);

        float number = Float.valueOf(edt.getText().toString());
        TextView tv= (TextView) findViewById(R.id.textView2);

        if (radio1.isChecked()){
          float floatVar =euroToDinar(number);
            String s = String.valueOf(floatVar);
            tv.setText(s);


        }
        if (radio2.isChecked()){
          float floatVar =dinarsToEuro(number);
            String s = String.valueOf(floatVar);
            tv.setText(s);


        }


}


    private float dinarsToEuro(float valeurDinar) {
        return (float) (valeurDinar * 0.31);
    }

    private float euroToDinar(float valeurEuro) {
        return (float) (valeurEuro * 3.23);
    }
    private boolean isNumber(String text) {
        return  true;
    }
}