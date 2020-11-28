package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class P411 extends WearableActivity {

    private Button p411y;
    private Button p411n;

    private long countDownTime;
    CountDownTimer countDownTimer;
    private int hintCount;
    private ArrayList hintArrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p411);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        countDownTime = (long) getIntent.getSerializableExtra("countDownTime");
        hintCount = (int) getIntent.getSerializableExtra("hintCount");
        hintArrayList = (ArrayList) getIntent.getSerializableExtra("hintArrayList");

        countDownTimer(countDownTime);

        p411y = findViewById(R.id.p411y);
        p411y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P421.class);
                intent.putExtra("countDownTime", countDownTime);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        p411n = findViewById(R.id.p411n);
        p411n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P412.class);
                intent.putExtra("countDownTime", countDownTime);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }

    public void countDownTimer(long millisInFuture) {
        countDownTimer= new CountDownTimer(millisInFuture, 1000) {
            public void onTick(long millisUntilFinished) {
                countDownTime = millisUntilFinished;
                Log.d("411CountDownTime", String.valueOf(countDownTime));
            }

            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), TimeOver.class);
                intent.putExtra("countDownTime", countDownTime);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}