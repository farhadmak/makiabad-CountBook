package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
Activity class for creating a counter
 */
public class createCounter extends AppCompatActivity {

    private String name;
    private Date date;
    private Integer curVal = 0;
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

    /*
    Method to setting the current date using SimpleDateFormat
     */
    public void setDate(TextView viewDate) {
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
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


    }
/*
cancel & reset button functionality
 */
    public void cancelCounter(View view) {
        finish();
    }
    public void resetCounter(View view) {
        finish();
        startActivity(getIntent());
    }
    /*
    When save button is clicked, save name, init val, curval, and comment if it exists
    If name or curval is left blank, do not finish activity and raise a toast.
     */
    public void saveCounter(View view) {
        //save Counter name
        EditText counterName = (EditText)findViewById(R.id.counterName);
        name = counterName.getText().toString();
        //save comment if it exists
        EditText commentText = (EditText)findViewById(R.id.commentText);
        if (commentText.getText().toString().trim().length() != 0){
            comment = commentText.getText().toString();
        }
        EditText initEdit = (EditText)findViewById(R.id.userinitVal);
        String initText = initEdit.getText().toString().trim();
        if ((name.trim().length() == 0) || (initText.isEmpty())) {
            Toast.makeText(createCounter.this, "You left a field blank!", Toast.LENGTH_SHORT).show();
        }
        else{
            finish();
        }

    }
/*
Increment & Decrement methods for plus and minus buttons
 */
    public void Decrement (View view){
        curVal = getCurVal();
        if (curVal > 0){
            curVal--;
        }
        TextView counterText = (TextView) findViewById(R.id.viewCounter);
        counterText.setText(String.valueOf(curVal));
    }
    public void Increment (View view){
        curVal = getCurVal();
        curVal++;
        TextView counterText = (TextView) findViewById(R.id.viewCounter);
        counterText.setText(String.valueOf(curVal));
    }
/*
When update button is pressed, set whatever value in the input field to the counter number.
 */
    public void updateInitVal(View view){
        EditText initEdit = (EditText)findViewById(R.id.userinitVal);
        TextView counterText = (TextView) findViewById(R.id.viewCounter);
        String initText = initEdit.getText().toString().trim();
        if (initText.isEmpty()) {
            Toast.makeText(createCounter.this, "You left the initial value blank!", Toast.LENGTH_SHORT).show();
        }
        else{
            counterText.setText(initEdit.getText().toString());
            initVal = Integer.parseInt(initEdit.getText().toString());
            curVal = Integer.parseInt(initEdit.getText().toString());
        }
    }
}
