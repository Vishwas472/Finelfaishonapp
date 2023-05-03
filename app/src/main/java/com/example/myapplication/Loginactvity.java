package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Loginactvity extends AppCompatActivity {

    Button btnregister;
    TextView txtsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactvity);
        initview();
    }

    private void initview() {
        btnregister=findViewById(R.id.btnregister);
        txtsignup=findViewById(R.id.txtsignup);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I =new Intent(Loginactvity.this,homepage.class);
                startActivity(I);
            }
        });
        txtsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent E =new Intent(Loginactvity.this,signupactivity.class);
                startActivity(E);
            }
        });

    }
}