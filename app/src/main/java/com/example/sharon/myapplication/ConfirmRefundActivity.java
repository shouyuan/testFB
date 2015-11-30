package com.example.sharon.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmRefundActivity extends AppCompatActivity {

    private SharedPreferences sp;
    private Button bt;
    private TextView TextView23aConfirm;
    private TextView TextView23bConfirm;
    private TextView TextView23cConfirm;
    private TextView TextView23dConfirm;
    private TextView TextView23eConfirm;
    private TextView TextView24Confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_refund);

        TextView23aConfirm = (TextView)findViewById(R.id.textView23aConfirm);
        TextView23bConfirm = (TextView)findViewById(R.id.textView23bConfirm);
        TextView23cConfirm = (TextView)findViewById(R.id.textView23cConfirm);
        TextView23dConfirm = (TextView)findViewById(R.id.textView23dConfirm);
        TextView23eConfirm = (TextView)findViewById(R.id.textView23eConfirm);
        TextView24Confirm = (TextView)findViewById(R.id.textView24Confirm);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        String string23aConfirm = sp.getString("Refund","");
        TextView23aConfirm.setText(string23aConfirm);
        String string23bConfirm = sp.getString("RoutingNum","");
        TextView23bConfirm.setText(string23bConfirm);
        String string23cConfirm = sp.getString("CheckingOrSaving","");
        TextView23cConfirm.setText(string23cConfirm);
        String string23dConfirm = sp.getString("AccountNum","");
        TextView23dConfirm.setText(string23dConfirm);
        String string23eConfirm = sp.getString("MailOutUS","");
        TextView23eConfirm.setText(string23eConfirm);
        String string24Confirm = sp.getString("Tax2015","");
        TextView24Confirm.setText(string24Confirm);

        bt = (Button)findViewById(R.id.confirmReBt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}