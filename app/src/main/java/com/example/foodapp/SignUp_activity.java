package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_activity extends AppCompatActivity {

    TextView alredy;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alredy=findViewById(R.id.already);
        register=findViewById(R.id.registerbtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_activity.this,"Account created successfully",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SignUp_activity.this,Signin_Activity.class);
                startActivity(intent);
            }
        });

        alredy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp_activity.this,Signin_Activity.class);
                startActivity(intent);
            }
        });
    }
}