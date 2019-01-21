package com.xj.hookdemo.activityhook;

import android.os.Bundle;

import com.xj.hookdemo.R;

import androidx.appcompat.app.AppCompatActivity;

public class TargetAppCompatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_app_compat);
    }
}
