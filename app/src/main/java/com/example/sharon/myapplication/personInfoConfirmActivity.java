package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;

public class personInfoConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info_confirm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences sharedpreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
       Map<String,?> mapinfo=sharedpreferences.getAll();
        String firstname= (String) mapinfo.get("first name");
        TextView showFirst=(TextView)findViewById(R.id.ShowFirstName);
        showFirst.setText(firstname);
        String lastname= (String) mapinfo.get("last name");
        TextView showLast=(TextView)findViewById(R.id.ShowLastName);
        showLast.setText(lastname);
        String ssn= (String) mapinfo.get("SSN");
        TextView showSSN=(TextView)findViewById(R.id.ShowSSN);
        showSSN.setText(ssn);
        String city= (String) mapinfo.get("city");
        TextView showCity=(TextView)findViewById(R.id.ShowCity);
        showCity.setText(city);
        String fCountry= (String) mapinfo.get("foreignCountry");
        TextView showfCountry=(TextView)findViewById(R.id.ShowForeignCountry);
        showfCountry.setText(fCountry);
        String fState= (String) mapinfo.get("foreignState");
        TextView showfState=(TextView)findViewById(R.id.ShowForeignState);
        showfState.setText(fState);
        String addr= (String) mapinfo.get("address");
        TextView showaddress=(TextView)findViewById(R.id.ShowAddr);
        showaddress.setText(addr);
        String zip= (String) mapinfo.get("foreignZip");
        TextView showforeignZip=(TextView)findViewById(R.id.ShowZip);
        showforeignZip.setText(zip);


        setSupportActionBar(toolbar);
      Button nextpageButton=(Button)findViewById(R.id.button2);
        nextpageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



         Intent i = new Intent(personInfoConfirmActivity.this, Income_Activity.class);
              startActivity(i);

            }
        });
    }

}
