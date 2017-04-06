package com.lifecycle.activity.demo.activity_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    Button btt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt = (Button) findViewById(R.id.button);
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
            }
        });
        Log.i("Activity A","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity A","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity A","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity A","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity A","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity A","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity A","onRestart");
    }
}
