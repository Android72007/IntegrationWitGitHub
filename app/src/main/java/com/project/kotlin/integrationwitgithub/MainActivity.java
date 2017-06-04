package com.project.kotlin.integrationwitgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(){
        int x = 0;
        x=x+1;
        x=x+5;
    }

    public void decrement(){
        int x = 0;
        x=x+1;
        x=x+5;
    }
    public void dec(){
        int x = 0;
        x=x+1;
        x=x+5;
    }
}
