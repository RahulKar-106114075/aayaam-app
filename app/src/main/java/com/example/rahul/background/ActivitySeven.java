package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by rahul on 12/12/17.
 */
public class ActivitySeven extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        Intent mIntent=getIntent();
        Integer i=mIntent.getIntExtra("intVariableName",0);
        int id=getResources().getIdentifier("r"+i,"layout",getPackageName());
        setContentView(id);
    }
}
