package com.hjs.ex_1206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView mv = new MyView(MainActivity.this);
        setContentView(mv);

    }
}
