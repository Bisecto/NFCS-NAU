package com.bisector.nfcsnau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        if(Build.VERSION.SDK_INT>=21){
            getWindow().setNavigationBarColor(ContextCompat.getColor(More.this,R.color.purple_500));
        }
    }

    public void Request(View view) {
        Intent i = new Intent(this,IdCardRequest.class);
        startActivity(i);
    }
}