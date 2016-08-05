package com.software55.app.mileageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomeThing(View view) {

        Intent callNextScreen = new Intent(this,SecondScreen.class);

        final int result = 1;

        callNextScreen.putExtra("keyValue","Hello Steve!!!");

        startActivity(callNextScreen);
        // startActivityForResult... for later

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView iamBack = (TextView) findViewById(R.id.titleText);
        iamBack.setText("Yea!!!");

    }

}
