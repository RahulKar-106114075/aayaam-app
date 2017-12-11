package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by rahul on 9/12/17.
 */

public class ActivityFour extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.umang_events);
        Button button1 = (Button)findViewById(R.id.button1);
        //set a onclick listener for when the button gets clicked
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityFour.this,ActivityFive.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        //set a onclick listener for when the button gets clicked
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityFour.this,ActivitySix.class);
                startActivity(intent);
            }
        });
    }
}
