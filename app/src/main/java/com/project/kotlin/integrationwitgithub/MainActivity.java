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
        x=x+4;
    }

    public void decrement(){
        int x = 0;
        x=x+1;
        x=x+4;
    }

    public void incdec(){
        int x = 0;
        x=x+1;
        x=x+4;
    }
}
