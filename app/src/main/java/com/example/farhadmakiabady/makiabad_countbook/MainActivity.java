package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //

    /** Called when the user taps the Send button */
    public void createCounter(View view) {
        Intent intent = new Intent(this, createCounter.class);
        //Button newCounterButton = (Button) findViewById(R.id.newCounter);
        startActivity(intent);
    }
}
