package com.lifecycle.activity.demo.activity_lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by karthicklove on 25/03/17.
 */

public class ActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.i("Activity B","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity B","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity B","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity B","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity B","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity B","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity B","onRestart");
    }
}
