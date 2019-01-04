package com.ozzy.android.zhucheng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


    String[] chineseNumbers = new String[10];
    chineseNumbers[0] = "一";
    chineseNumbers[1] = "二";
    chineseNumbers[2] = "三";
    chineseNumbers[3] = "四";
    chineseNumbers[4] = "五";
    chineseNumbers[5] = "六";
    chineseNumbers[6] = "七";
    chineseNumbers[7] = "八";
    chineseNumbers[8] = "九";
    chineseNumbers[9] = "十";

    }
}
