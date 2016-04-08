package com.example.thelastlaugh.blooddonation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeekerHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_homepage);

        String username = getIntent().getStringExtra("uname_text");
        String userType = getIntent().getStringExtra("userType");

        TextView seekerName = (TextView)findViewById(R.id.seeker_name);

        seekerName.setText("Welcome, " + username);
    }
}