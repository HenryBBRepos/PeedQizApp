package com.example.peedqiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        ImageView imageView = (ImageView) findViewById(R.id.peed);
        Animation logo_anim = AnimationUtils.loadAnimation(this,R.anim.transition);
        imageView.startAnimation(logo_anim);
        final Intent i = new Intent(this,CreateAccount.class);
        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
