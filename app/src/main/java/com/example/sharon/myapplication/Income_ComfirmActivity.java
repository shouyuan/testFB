package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Income_ComfirmActivity extends AppCompatActivity {

    private Button bt;
    private SharedPreferences sp;
    private TextView block1;
    private TextView block2 ;
    private TextView block3;
    private TextView block4;
    private TextView block5;
    private TextView block6 ;
    private TextView block7;
    private TextView block8;
    private TextView block9;
    private TextView block10;
    private TextView block11 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_confirm);

        block1 = (TextView) findViewById(R.id.textView115);
        block2 = (TextView)findViewById(R.id.textView27);
       block3 = (TextView)findViewById(R.id.textView9);
       block4 = (TextView)findViewById(R.id.textView11);
       block5 = (TextView)findViewById(R.id.textView13);
       block6 = (TextView)findViewById(R.id.textView15);
       block7 = (TextView)findViewById(R.id.textView17);
       block8 = (TextView)findViewById(R.id.textView19);
       block9 = (TextView)findViewById(R.id.textView21);
       block10 = (TextView)findViewById(R.id.textView23);
       block11 = (TextView)findViewById(R.id.textView25);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);;

        String string1 = sp.getString("wage","");
        block1.setText(string1);
        String string2 = sp.getString("taxable_refund","");
        block2.setText(string2);
        String string3 = sp.getString("scholarship","");
        block3.setText(string3);
        String string4 = sp.getString("treaty","");
        block4.setText(string4);
        String string5 = sp.getString("treaty_type","");
        block5.setText(string5);
        String string6 = sp.getString("itemlized_deduction","");
        block6.setText(string6);
        String string7 = sp.getString("exemption","");
        block7.setText(string7);
        String string8 = sp.getString("federal_withheld_W2","");
        block8.setText(string8);
        String string9 = sp.getString("federal_withheld_1042S","");
        block9.setText(string9);
        String string10 = sp.getString("return_of_2013","");
        block10.setText(string10);
        String string11 = sp.getString("credit_1040C","");
        block11.setText(string11);

        bt = (Button)findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*xx.class放下一页面名字
                Intent i = new Intent(Income_ComfirmActivity.this,xx.class);
                startActivityForResult(i,0);
                */
            }
        });
    }
}
