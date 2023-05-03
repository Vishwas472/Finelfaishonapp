package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Categoriesactivity extends AppCompatActivity {
    LinearLayout Discount;
    TextView txtwomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoriesactivity);
        Initview();
    }

    private void Initview() {
        Discount=findViewById(R.id.Discount);
        txtwomen=findViewById(R.id.txtwomen);
        Discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B=new Intent(Categoriesactivity.this,discount123activiy.class);
                startActivity(B);
            }
        });
        txtwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C=new Intent(Categoriesactivity.this,disscount_Activity.class);
                startActivity(C);
            }
        });
    }
}