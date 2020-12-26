package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button signup;
    TextView skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //Transparent Action bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        login=findViewById(R.id.btnlogin);
        signup=findViewById(R.id.btnsignup);
        skip=findViewById(R.id.skiptxt);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Login",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,Signin_Activity.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Signup",Toast.LENGTH_LONG).show();
                Intent two=new Intent(MainActivity.this,SignUp_activity.class);
                startActivity(two);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skipper=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(skipper);
            }
        });
    }

}
