package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P151 extends WearableActivity {

    private Button p151y;
    private Button p151n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p151);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p151y = findViewById(R.id.p151y);
        p151y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("hintCount", hintCount);
                intent.putExtra("hintNumber", 10);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        p151n = findViewById(R.id.p151n);
        p151n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P152.class);
                intent.putExtra("hintCount", hintCount);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}