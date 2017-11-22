package com.timtimes.utsrobinfatchur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainHasil extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hasil);
        getSupportActionBar().setTitle("UTS ROBIN DAN FATUR");

        tv = (TextView)findViewById(R.id.tv);
        Intent i = getIntent();
        String nilai = i.getStringExtra("nilai");
        tv.setText(nilai);
    }
}
