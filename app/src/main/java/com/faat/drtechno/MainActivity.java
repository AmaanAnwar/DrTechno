package com.faat.drtechno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.year);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),step_one.class);
                startActivity(intent);
                finish();
            }
        },3000);
        int year ;
        year= Calendar.getInstance().get(Calendar.YEAR);
        String upd=String.valueOf(year);
        textView.setText("Copyright @ "+upd);

    }

}
