package com.example.peedqiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_display);
        getSupportActionBar().hide();
    }

    public void ToDashboard(View view)
    {
        Intent intent = new Intent(QuestionDisplay.this, Dashboard.class);
        startActivity(intent);

    }
}
