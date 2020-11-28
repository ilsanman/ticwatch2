package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P411 extends WearableActivity {

    private Button p411y;
    private Button p411n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p411);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p411y = findViewById(R.id.p411y);
        p411y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P421.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });

        p411n = findViewById(R.id.p411n);
        p411n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P412.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });
    }
}