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

import org.json.JSONException;
import org.json.JSONObject;

public class income2_Activity extends AppCompatActivity {

    private Button bt;
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);


        bt = (Button)findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONObject object = new JSONObject();
                SharedPreferences.Editor editor = sp.edit();

                EditText EditText1 = (EditText)findViewById(R.id.editText8);
                String etString1 = EditText1.getText().toString();
                editor.putString("federal_withheld_W2",etString1);

                EditText EditText2 = (EditText)findViewById(R.id.editText9);
                String etString2 = EditText2.getText().toString();
                editor.putString("federal_withheld_1042S",etString2);

                EditText EditText3 = (EditText)findViewById(R.id.editText10);
                String etString3 = EditText3.getText().toString();
                editor.putString("return_of_2013",etString3);

                EditText EditText4 = (EditText)findViewById(R.id.editText11);
                String etString4 = EditText4.getText().toString();
                editor.putString("credit_1040C",etString4);

                editor.commit();

                try{
                    object.put("federal_withheld_W2",etString1);
                    object.put("federal_withheld_1042S",etString2);
                    object.put("return_of_2013",etString3);
                    object.put("credit_1040C",etString4);
                    System.out.println(object);
                } catch(JSONException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                Intent i = new Intent(income2_Activity.this, Income_ComfirmActivity.class);
                startActivity(i);
            }
        });
    }
}
