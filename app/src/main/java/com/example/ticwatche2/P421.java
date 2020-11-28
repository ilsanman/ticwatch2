package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P421 extends WearableActivity {

    private Button p421y;
    private Button p421n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p421);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p421y = findViewById(R.id.p421y);
        p421y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P431.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });

        p421n = findViewById(R.id.p421n);
        p421n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P422.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });
    }
}