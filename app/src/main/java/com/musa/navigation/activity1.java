package com.musa.navigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
