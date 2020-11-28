package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P241 extends WearableActivity {

    private Button p241y;
    private Button p241n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p241);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p241y = findViewById(R.id.p241y);
        p241y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintNumber", 20);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        p241n = findViewById(R.id.p241n);
        p241n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P242.class);
                intent.putExtra("hintCount", hintCount);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}