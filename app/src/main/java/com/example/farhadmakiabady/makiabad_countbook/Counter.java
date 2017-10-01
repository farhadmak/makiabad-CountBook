package com.example.farhadmakiabady.makiabad_countbook;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by farhadmakiabady on 2017-09-27.
 */

public class Counter extends createCounter{
    private String name;
    private Date date;
    private Integer curVal;
    private Integer initVal;


    public Counter(String name, Date date, Integer curVal, Integer initVal){
        this.name = name;
        this.date = date;
        this.curVal = curVal;
        this.initVal = initVal;



    }

    public Counter(String name, Date date, Integer curVal, Integer initVal, String comment){

    }
    public String getName(){
        return name;
    }
    public Date getDate() {
        return date;
    }
    public Integer getCurVal(){
        return curVal;
    }
    public Integer getInitVal(){
        return initVal;
    }

    public String toString(){
        return "Name: " + getName() + " | " + "CurVal: " + getCurVal() + " | " + "InitVal: " + getInitVal();
    }
}
