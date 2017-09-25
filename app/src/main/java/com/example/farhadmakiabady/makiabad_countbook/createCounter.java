package com.example.farhadmakiabady.makiabad_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class createCounter implements Counter {

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
    public Integer getCurVal() {
        return curVal;
    }
    public Integer getInitVal() {
        return initVal;
    }
    public void setDate(Date date) {this.date = date;}

}
