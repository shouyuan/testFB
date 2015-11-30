package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class personInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button nextpageButton=(Button)findViewById(R.id.personInfoNextPageButton);
        nextpageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                JSONObject object = new JSONObject();
                EditText firstNameET=(EditText)findViewById(R.id.editTextFirstName);
                String firstnameString=firstNameET.getText().toString();
                EditText lastNameET=(EditText)findViewById(R.id.editTextLastName);
                String lastnameString=lastNameET.getText().toString();
                EditText ssnET=(EditText)findViewById(R.id.editTextSSN);
                String ssnString=ssnET.getText().toString();
                EditText addressET=(EditText)findViewById(R.id.editTextAddress);
                String addressString=addressET.getText().toString();
                EditText cityET=(EditText)findViewById(R.id.editTextCity);
                String cityString=cityET.getText().toString();
                SharedPreferences sharedpreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("first name", firstnameString);
                editor.putString("last name", lastnameString);
                editor.putString("address", addressString);
                editor.putString("SSN", ssnString);
                editor.putString("city", cityString);
                editor.commit();

                try{
                    object.put("first name", firstnameString);
                    object.put("last name", lastnameString);
                    object.put("address", addressString);
                    object.put("SSN", ssnString);
                    object.put("city", cityString);
                    System.out.println(object);
                } catch(JSONException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                Intent i = new Intent(personInfoActivity.this, ForeignInfoActivity.class);
                startActivity(i);

            }
        });

    }

}
