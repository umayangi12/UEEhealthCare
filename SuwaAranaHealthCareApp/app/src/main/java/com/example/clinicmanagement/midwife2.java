package com.example.clinicmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class midwife2 extends AppCompatActivity {

    private TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midwife2);
        getSupportActionBar().setTitle("Request Midwife");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        skip = findViewById(R.id.btn_request);

//        skip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(midwife1.this, midwife2.class));
//            }
//        });

    }
}