package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by rahul on 8/12/17.
 */

public class ActivityTwo extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the button view
        CircleImageView fashionImg1 = (CircleImageView)findViewById(R.id.profile_image);
        //set a onclick listener for when the button gets clicked
        fashionImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this,ActivityThree.class);

                startActivity(intent);
            }
            //Start new list activity


        });
        CircleImageView fashionImg2 = (CircleImageView)findViewById(R.id.profile_image1);
        //set a onclick listener for when the button gets clicked
        fashionImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this,ActivityThree.class);

                startActivity(intent);
            }
            //Start new list activity


        });
        CircleImageView fashionImg3 = (CircleImageView)findViewById(R.id.profile_image2);
        //set a onclick listener for when the button gets clicked
        fashionImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this,ActivityThree.class);

                startActivity(intent);
            }
            //Start new list activity


        });
        CircleImageView fashionImg4 = (CircleImageView)findViewById(R.id.profile_image3);
        //set a onclick listener for when the button gets clicked
        fashionImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this,ActivityThree.class);

                startActivity(intent);
            }
            //Start new list activity


        });

    }
}


