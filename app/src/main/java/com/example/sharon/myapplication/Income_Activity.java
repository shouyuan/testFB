package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Income_Activity extends AppCompatActivity {
    private Button bt;
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);


        bt = (Button)findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();

                EditText EditText1 = (EditText)findViewById(R.id.editText);
                String etString1 = EditText1.getText().toString();
                editor.putString("wage",etString1);

                EditText EditText2 = (EditText)findViewById(R.id.editText2);
                String etString2 = EditText2.getText().toString();
                editor.putString("taxable_refund",etString2);

                EditText EditText3 = (EditText)findViewById(R.id.editText3);
                String etString3 = EditText3.getText().toString();
                editor.putString("scholarship",etString3);

                EditText EditText4 = (EditText)findViewById(R.id.editText4);
                String etString4 = EditText4.getText().toString();
                editor.putString("treaty",etString4);

                EditText EditText5 = (EditText)findViewById(R.id.editText5);
                String etString5 = EditText5.getText().toString();
                editor.putString("treaty_type",etString5);

                EditText EditText6 = (EditText)findViewById(R.id.editText6);
                String etString6 = EditText6.getText().toString();
                editor.putString("itemlized_deduction",etString6);

                EditText EditText7 = (EditText)findViewById(R.id.editText7);
                String etString7 = EditText7.getText().toString();
                editor.putString("exemption",etString7);

                editor.commit();
                Intent i = new Intent(Income_Activity.this,income2_Activity.class);
                startActivity(i);
            }
        });
    }
}