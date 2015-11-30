package com.example.sharon.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import org.json.JSONException;
import org.json.JSONObject;

public class Refund_Activity extends AppCompatActivity {

    private Button button;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund_);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JSONObject object = new JSONObject();
                SharedPreferences.Editor editor = sp.edit();

                EditText EditText1 = (EditText) findViewById(R.id.editText23a);
                String editText23aString = EditText1.getText().toString();
                editor.putString("Refund", editText23aString);

                EditText EditText2 = (EditText) findViewById(R.id.editText23b);
                String editText23bString = EditText2.getText().toString();
                editor.putString("RoutingNum", editText23bString);

                RadioGroup RadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
                Integer radioGroup = RadioGroup.getCheckedRadioButtonId();
                editor.putString("CheckingOrSaving", String.valueOf(radioGroup - 2131493067));

                EditText EditText3 = (EditText) findViewById(R.id.editText23d);
                String editText23dString = EditText3.getText().toString();
                editor.putString("AccountNum", editText23dString);

                EditText EditText4 = (EditText) findViewById(R.id.editText23e);
                String editText23eString = EditText4.getText().toString();
                editor.putString("MailOutUS", editText23eString);

                EditText EditText5 = (EditText) findViewById(R.id.editText24);
                String editText24String = EditText5.getText().toString();
                editor.putString("Tax2015", editText24String);

                editor.commit();

                try{
                    object.put("Refund", editText23aString);
                    object.put("RoutingNum", editText23bString);
                    object.put("CheckingOrSaving", String.valueOf(radioGroup - 2131493067));
                    object.put("AccountNum", editText23dString);
                    object.put("MailOutUS", editText23eString);
                    object.put("Tax2015", editText24String);
                    System.out.println(object);
                } catch(JSONException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                Intent i = new Intent(Refund_Activity.this, ConfirmRefundActivity.class);
                startActivity(i);
            }
        });


    }

}
