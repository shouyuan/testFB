package com.example.sharon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class WelcomePageActivity extends AppCompatActivity {

    private Button regBt;
    private Button signBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        regBt = (Button)findViewById(R.id.reged);
        regBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(WelcomePageActivity.this,MainActivity.class);
                startActivity(i1);
            }
        });

        signBt = (Button)findViewById(R.id.nonreged);
        signBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(WelcomePageActivity.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }

}
