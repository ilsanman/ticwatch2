package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class ManagerActivity extends WearableActivity {

    private TextView hintUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        hintUse = findViewById(R.id.hintUse);

        Intent getIntent = getIntent();

        long countDownTime = (long) getIntent.getSerializableExtra("countDownTime");
        long getHour = countDownTime / (60 * 60 * 1000) ;
        String hour = String.valueOf(getHour);
        long getMin = (countDownTime - (getHour * 60 * 60 * 1000)) / (60 * 1000);
        String min = String.valueOf(getMin);
        long getSecond = (countDownTime - (getHour * 60 * 60 * 1000) - (getMin * 60 * 1000)) / 1000;
        String second = String.valueOf(getSecond);

        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        if (min.length() == 1) {
            min = "0" + min;
        }
        if (second.length() == 1) {
            second = "0" + second;
        }
        String time = hour + ":" + min + ":" + second;

        int hintCount = (int) getIntent.getSerializableExtra("hintCount");

        ArrayList hintArrayList = (ArrayList) getIntent.getSerializableExtra("hintArrayList");
        String hintUses = "";
        for (int i = 0; i < hintArrayList.size(); i++) {
            hintUses += (hintArrayList.get(i) + ", ");
        }

        hintUse.setText(time + "\ncount: " + hintCount + "\n" + hintUses);
    }
}