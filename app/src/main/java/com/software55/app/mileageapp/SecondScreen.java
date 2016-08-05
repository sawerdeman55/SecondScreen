package com.software55.app.mileageapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by werdemanTax on 8/5/2016.
 */
public class SecondScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_screen);

        // need to get data...
        Intent getCallingData = getIntent();

        String sentData = getCallingData.getExtras().getString("keyValue");

        TextView messageToDisplay = (TextView) findViewById(R.id.textView);

        messageToDisplay.append("-->"+ sentData);


    }

    public void goBack(View view) {

        Intent goingBack = new Intent();

        setResult(RESULT_OK,goingBack);

        finish();
    }
}
