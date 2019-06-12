package com.example.chenhao.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.billy.cc.core.component.CC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        CC.obtainBuilder("Conponent_1")
                .setActionName("TestActivity")
                .build()
                .call();
    }
}
