package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterList = (ListView) findViewById(R.id.counterList);




//        counteramount = counterList.getAdapter().getCount();
//        TextView viewcounterAmount = (TextView) findViewById(R.id.counterNum);
//        viewcounterAmount.setText(counteramount);
    }

    //
    /** Called when the user taps the add new counter button */
    public void createCounter(View view) {
        Intent intent = new Intent(this, createCounter.class);
        startActivity(intent);
        Counter testcounter = new Counter(name, date, curVal, initVal);
        addCounter(testcounter);

    }
    public void addCounter(Counter counter){
        counters.add(counter);
        adapter.notifyDataSetChanged();
    }

//    /*****************************************************************/
//    private ArrayList<createCounter> counters = new ArrayList<createCounter>();
//    private ArrayAdapter<createCounter> adapter;
//    private static final String FILENAME = "file.sav";
//    private EditText bodyText;
//    private ListView counterList;
//
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        adapter = new ArrayAdapter<Counter>(
                this, R.layout.counter_list_item, counters);

        counterList.setAdapter(adapter);
    }
}
