package com.ozzy.android.zhucheng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("一");
        numbers.add("二");
        numbers.add("三");
        numbers.add("四");
        numbers.add("五");
        numbers.add("六");
        numbers.add("七");
        numbers.add("八");
        numbers.add("九");
        numbers.add("十");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        ArrayList<TextView> numberView = new ArrayList<TextView>();
        for (int i = 0 ; i < numbers.size() ; i++){
            TextView perNumber = new TextView(this);
            perNumber.setText(numbers.get(i));
            numberView.add(perNumber);
            rootView.addView(numberView.get(i));
        }
    }
}
