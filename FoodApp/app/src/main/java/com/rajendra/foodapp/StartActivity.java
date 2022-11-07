package com.rajendra.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        AppCompatButton about=findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,AboutActivity.class));
            }
        });

        AppCompatButton foods=findViewById(R.id.foods);
        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,MainActivity.class));
            }
        });

        AppCompatButton phone=findViewById(R.id.call_us);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:88877766"));//
                startActivity(callIntent);
            }
        });

        AppCompatButton work=findViewById(R.id.work_hours);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StartActivity.this, "Long Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        work.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(StartActivity.this, "Work Hours is : 12 Hour", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}