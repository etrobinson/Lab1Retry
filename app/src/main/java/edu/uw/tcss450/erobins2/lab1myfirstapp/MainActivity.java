package edu.uw.tcss450.erobins2.lab1myfirstapp;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resume", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("pause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("stop", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("destroy", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("restart", "onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}