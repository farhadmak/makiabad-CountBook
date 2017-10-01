package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private ArrayList<createCounter> counters = new ArrayList<createCounter>();
//    private ArrayAdapter<createCounter> adapter;
//    private static final String FILENAME = "file.sav";
//    private EditText bodyText;

//    public int counteramount;
    private String name;
    private Date date;
    private Integer curVal;
    private Integer initVal;
    private String comment;
    private ListView counterList;
    private ArrayAdapter<Counter> adapter;
    private ArrayList<Counter> counters = new ArrayList<Counter>();
    private Counter testcounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //counterList = (ListView) findViewById(R.id.counterList);
        registerClick();


    }
/*
Method for what happens when clicking on an item in the arraylist
 */
    private void registerClick() {
        counterList = (ListView) findViewById(R.id.counterList);
        counterList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> counterDetail, View view, int pos, long id) {
                Intent intent = new Intent(MainActivity.this, createCounter.class);
                startActivity(intent);

            }
        });
    }

    //
    /** Called when the user taps the add new counter button */
    public void createCounter(View view) {
        Intent intent = new Intent(this, createCounter.class);
        startActivity(intent);
        testcounter = new Counter(name, date, curVal, initVal);
        addCounter(testcounter);

        //update counter to size of arraylist
        Integer counteramount = counters.size();
        System.out.println("length of ArrayList after adding elements: " + counteramount);
        TextView viewcounterAmount = (TextView) findViewById(R.id.counterNum);
        viewcounterAmount.setText(String.valueOf(counteramount));

    }
    /*
    method to add a counter to the arraylist
     */
    public void addCounter(Counter counter){
        counters.add(counter);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        adapter = new ArrayAdapter<Counter>(
                this, R.layout.counter_list_item, counters);

        counterList.setAdapter(adapter);
    }
}
