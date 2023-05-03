package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class disscount_Activity extends AppCompatActivity {
    TextView txtkids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disscount);
        Initview();
    }

    private void Initview() {
        txtkids=findViewById(R.id.txtkids);
        txtkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent D=new Intent(disscount_Activity.this,categories3.class);
                startActivity(D);
            }
        });
    }
}