package com.bisector.nfcsnau;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ArrayList<String> List_Prayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=21){
            getWindow().setNavigationBarColor(ContextCompat.getColor(MainActivity.this,R.color.purple_500));
        }
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Prayer:
                        Prayer prayer= new Prayer();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment, prayer, null);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        return true;
                    case R.id.Anthem:
                        Anthem anthem= new Anthem();
                        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                        trans.replace(R.id.fragment, anthem, null);
                        trans.addToBackStack(null);
                        trans.commit();
                        return true;
                    case R.id.News:
                        News news= new News();
                        FragmentTransaction transactio = getSupportFragmentManager().beginTransaction();
                        transactio.replace(R.id.fragment, news, null);
                        transactio.addToBackStack(null);
                        transactio.commit();
                        return true;
                    case R.id.Mass:
                        Mass mass= new Mass();
                        FragmentTransaction transact = getSupportFragmentManager().beginTransaction();
                        transact.replace(R.id.fragment, mass, null);
                        transact.addToBackStack(null);
                        transact.commit();
                        return true;
                    case R.id.More:
                        Intent i =new Intent(MainActivity.this,More.class);
                        startActivity(i);
                        return true;
                }
                return false;
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setCancelable(true);
        dialog.setTitle("Quit?");
        dialog.setMessage("are you sure you want to Quit");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        final AlertDialog alert = dialog.create();
        alert.show();
    }
}