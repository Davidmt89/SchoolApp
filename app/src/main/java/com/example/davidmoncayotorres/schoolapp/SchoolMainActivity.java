package com.example.davidmoncayotorres.schoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SchoolMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_main);
    }

    public void options(View v){
        startActivity(new Intent(this, OptionsActivity.class));
    }
}
