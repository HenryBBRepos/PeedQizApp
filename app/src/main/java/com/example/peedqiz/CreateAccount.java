package com.example.peedqiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        getSupportActionBar().hide();
    }


    public void ToDashboard(View view)
    {
        Intent intent = new Intent(CreateAccount.this, Dashboard.class);
        startActivity(intent);

    }
}
