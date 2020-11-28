package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TimeOver extends WearableActivity {

    private Button managerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_over);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        managerButton= findViewById(R.id.managerButton);
        managerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getIntent = getIntent();
                Intent intent = new Intent(getApplicationContext(), ManagerActivity.class);
                intent.putExtra("countDownTime", getIntent.getSerializableExtra("countDownTime"));
                intent.putExtra("hintCount", getIntent.getSerializableExtra("hintCount"));
                intent.putExtra("hintArrayList", getIntent.getSerializableExtra("hintArrayList"));
                startActivity(intent);
            }
        });
    }
}