package com.example.ciclodivita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("prova", "stringa di prova di onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("prova", "stringa di prova di onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("prova", "stringa di prova di onResume");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("prova", "stringa di prova di onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("prova", "stringa di prova di onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("prova", "stringa di prova di onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("prova", "stringa di prova di onDestroy");
    }









}