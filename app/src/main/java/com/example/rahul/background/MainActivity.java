package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by rahul on 9/12/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
                finishscreen();
            }
        };
        Timer t = new Timer();
        t.schedule(task, 5000);

    }
    private void finishscreen() {
        this.finish();
    }

}

