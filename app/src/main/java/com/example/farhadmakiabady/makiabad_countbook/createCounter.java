package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class createCounter extends AppCompatActivity implements Counter {

    private String name;
    private Date date;
    private Integer curVal;
    private Integer initVal;
    private String comment;

    public String getName(){
        return name;
    }
    public Date getDate() {
        return date;
    }
    public Integer getInitVal() {
        return initVal;
    }
    public Integer getCurVal() {
        return curVal;
    }
    public void setDate(TextView viewDate) {
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy");
        String date = formatter.format(today);
        viewDate.setText(date);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_counter);
        //View Date
        TextView dateText = (TextView) findViewById(R.id.viewDate);
        setDate(dateText);
        //Get init value from user input
        EditText initEdit   = (EditText)findViewById(R.id.userinitVal);
        //initVal = initEdit.getText().toString();

    }

    public void cancelCounter(View view) {
        finish();
    }
    public void resetCounter(View view) {
        finish();
        startActivity(getIntent());
    }

    public void Decrement (View view){
        curVal = getCurVal();
        curVal -= 1;
        TextView counterText = (TextView) findViewById(R.id.viewCounter);
        counterText.setText(String.valueOf(curVal));
    }
    public void Increment (View view){
        curVal = getCurVal();
        curVal += 1;
        TextView counterText = (TextView) findViewById(R.id.viewCounter);
        counterText.setText(String.valueOf(curVal));
    }
}
