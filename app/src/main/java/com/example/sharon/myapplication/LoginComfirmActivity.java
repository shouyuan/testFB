package com.example.sharon.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginComfirmActivity extends AppCompatActivity {
    public ImageView user_image;
    public ImageView user_image_side;
    public TextView user_id_side;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_comfirm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        user_image=(ImageView)findViewById(R.id.imageView);

        user_image.setImageBitmap(StringToBitMap(MainActivity.bitString));

        Button rightButton=(Button)findViewById(R.id.rightInfoButton);
        rightButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MainActivity ma = new MainActivity();
                user_image_side = (ImageView)findViewById(R.id.portrait);
                user_image_side.setImageBitmap(StringToBitMap(MainActivity.bitString));
                user_id_side = (TextView)findViewById(R.id.usernameside);
                user_id_side.setText(ma.usrName);
                Intent i = new Intent(LoginComfirmActivity.this, personInfoActivity.class);
                startActivity(i);
            }
        });
        Button wrongButton=(Button)findViewById(R.id.WrorngInfoButton);
        wrongButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent  i = new Intent(LoginComfirmActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
    public Bitmap StringToBitMap(String encodedString){
        try {
            byte [] encodeByte= Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap= BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
            return bitmap;
        } catch(Exception e) {
            e.getMessage();
            return null;
        }
    }
}
