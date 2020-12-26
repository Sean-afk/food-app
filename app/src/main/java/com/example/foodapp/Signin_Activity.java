package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Signin_Activity extends AppCompatActivity {

    TextView create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().setTitle("Log in");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        create=findViewById(R.id.createNew);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(Signin_Activity.this,SignUp_activity.class);
                startActivity(two);
            }
        });

    }


}