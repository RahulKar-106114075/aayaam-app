package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by rahul on 11/12/17.
 */

public class ActivityFive extends AppCompatActivity implements View.OnClickListener{
    Integer i=0;
    @Override
    protected void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        Intent mIntent = getIntent();
        Integer intValue = mIntent.getIntExtra("intVariableName",0);
        i=intValue;
        int id = getResources().getIdentifier("e"+intValue, "layout", getPackageName());
        setContentView(id);
        Button one = (Button) findViewById(R.id.Button01);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.Button02);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.Button03);
        three.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.Button01:
                Intent myIntent1 = new Intent(ActivityFive.this, ActivitySix.class);
                myIntent1.putExtra("intVariableName", i);
                startActivity(myIntent1);
                break;
            case R.id.Button02:
                Intent myIntent2 = new Intent(ActivityFive.this, ActivitySeven.class);
                myIntent2.putExtra("intVariableName", i);
                startActivity(myIntent2);
                break;
            case R.id.Button03:
                Intent myIntent3 = new Intent(ActivityFive.this, ActivityEight.class);
                myIntent3.putExtra("intVariableName", i);
                startActivity(myIntent3);
                break;
            default:
                break;
        }

    }
}
