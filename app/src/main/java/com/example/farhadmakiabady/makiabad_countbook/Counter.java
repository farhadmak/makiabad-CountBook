package com.example.farhadmakiabady.makiabad_countbook;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by farhadmakiabady on 2017-09-27.
 */

public class Counter extends createCounter{
    public Counter(String name, Date date, Integer curVal, Integer initVal){
        name = new createCounter().getName();
        date = new createCounter().getDate();
        curVal = new createCounter().getCurVal();
        initVal = new createCounter().getInitVal();



    }

    public Counter(String name, Date date, Integer curVal, Integer initVal, String comment){

    }

    public String toString(){
        return "Name: " + getName() + " | " + "CurVal: " + getCurVal() + " | " + "InitVal: " + getInitVal();
    }
}
