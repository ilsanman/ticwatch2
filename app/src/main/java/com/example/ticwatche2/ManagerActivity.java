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

        hintUse = (TextView) findViewById(R.id.hintUse);

        Intent getIntent = getIntent();
        int hintCount = (int) getIntent.getSerializableExtra("hintCount");
        ArrayList hintNumber = (ArrayList) getIntent.getSerializableExtra("hintNumber");
        String hintUses = "";
        for (int i = 0; i < hintNumber.size(); i++) {
            hintUses += (hintNumber.get(i) + ", ");
        }
        hintUse.setText(hintCount + "ea, " + hintUses);
    }
}