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

public class P441 extends WearableActivity {

    private Button p441y;
    private Button p441n;

    private long countDownTime;
    CountDownTimer countDownTimer;
    private int hintCount;
    private ArrayList hintArrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p441);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        countDownTime = (long) getIntent.getSerializableExtra("countDownTime");
        hintCount = (int) getIntent.getSerializableExtra("hintCount");
        hintArrayList = (ArrayList) getIntent.getSerializableExtra("hintArrayList");

        countDownTimer(countDownTime);

        p441y = findViewById(R.id.p441y);
        p441y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P451.class);
                intent.putExtra("countDownTime", countDownTime);
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintArrayList", hintArrayList);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        p441n = findViewById(R.id.p441n);
        p441n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P442.class);
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
                Log.d("441CountDownTime", String.valueOf(countDownTime));
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