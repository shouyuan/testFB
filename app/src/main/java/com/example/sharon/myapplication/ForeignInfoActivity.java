package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class ForeignInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button nextpageButton=(Button)findViewById(R.id.foreignNextButton);
        nextpageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                JSONObject object = new JSONObject();

                EditText foreignCountryET=(EditText)findViewById(R.id.editTextForeignCountry);
                String foreignCountryString=foreignCountryET.getText().toString();
                EditText foreignStateET=(EditText)findViewById(R.id.editTextForeignState);
                String foreignStateString=foreignStateET.getText().toString();
                EditText foreignZipET=(EditText)findViewById(R.id.editTextForeignZip);
                String  foreignZipString= foreignZipET.getText().toString();



                SharedPreferences sharedpreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("foreignCountry", foreignCountryString);
                editor.putString("foreignState", foreignStateString);
                editor.putString("foreignZip", foreignZipString);
                editor.commit();

                try{
                    object.put("foreignCountry", foreignCountryString);
                    object.put("foreignState", foreignStateString);
                    object.put("foreignZip", foreignZipString);
                    System.out.println(object);
                }catch(JSONException e){

                }

                Intent i = new Intent(ForeignInfoActivity.this, personInfoConfirmActivity.class);
                startActivity(i);
            }
        });
    }

}
