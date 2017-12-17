package com.example.rahul.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/**
 * Created by rahul on 12/12/17.
 */
public class ActivitySix extends AppCompatActivity{
    Button showPopupBtn, closePopupBtn;
    PopupWindow popupWindow;
    RelativeLayout linearLayout1;
    int i,j;
    @Override
    protected void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        Intent mIntent=getIntent();
        Integer in=mIntent.getIntExtra("intVariableName",0);
        i=getResources().getIdentifier("e"+i,"layout",getPackageName());
        j=getResources().getIdentifier("a"+i,"layout",getPackageName());
        setContentView(j);
       /* showPopupBtn = (Button) findViewById(R.id.Button01);
        linearLayout1 = (RelativeLayout) findViewById(R.id.linearLayout1);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) ActivitySix.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(j,null);

                closePopupBtn = (Button) customView.findViewById(R.id.closePopupBtn);

                //instantiate popup window
                popupWindow = new PopupWindow(customView, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);

                //display the popup window
                popupWindow.showAtLocation(linearLayout1, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closePopupBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

            }
        }); */

    }
//8900230424
}
