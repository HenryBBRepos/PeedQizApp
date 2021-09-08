package com.example.peedqiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getSupportActionBar().hide();
    }



    public void ToQuestion(View view)
    {
        Intent intent = new Intent(Dashboard.this, QuestionDisplay.class);
        startActivity(intent);

    }



    public void ToPremium(View view)
    {
        Intent intent = new Intent(Dashboard.this, GoPremium.class);
        startActivity(intent);

    }


    public void ToLeadeboard(View view)
    {
        Intent intent = new Intent(Dashboard.this, Leaderboard.class);
        startActivity(intent);

    }
}
