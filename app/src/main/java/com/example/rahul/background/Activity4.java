package com.example.rahul.background;

/**
 * Created by rahul on 17/12/17.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Activity4 extends Activity {

    GridView gridview;

    public static String[] osNameList = {
            "Criket Quiz",
            "Bollywood Quiz",
            "Bluff Master",
            "Extempore",
            "India Quiz",
            "Halka Fulka",
            "Crossword",
            "JAM",
            "Debate",
            "Creative Writing",
            "Dumb C",
            "Treasure Hunt",
            "Chakravyuh",
            "Rochak Mantrana"
    };
    public static int[] osImages = {
            R.drawable.cqh,
            R.drawable.bq,
            R.drawable.bluff,
            R.drawable.extempore,
            R.drawable.india,
            R.drawable.halka,
            R.drawable.crossy,
            R.drawable.jam,
            R.drawable.debate,
            R.drawable.creative,
            R.drawable.dumbc,
            R.drawable.treasure,
            R.drawable.aptitude,
            R.drawable.rochak,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages));
    }
}