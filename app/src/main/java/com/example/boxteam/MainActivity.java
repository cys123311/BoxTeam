package com.example.boxteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.QwertyKeyListener;
import android.util.Log;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i( "TAG", "onCreate: "+ 123456 );

        Log.e("111","ok");
    }
}