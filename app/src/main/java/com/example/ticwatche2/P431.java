package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P431 extends WearableActivity {

    private Button p431y;
    private Button p431n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p431);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p431y = findViewById(R.id.p431y);
        p431y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P441.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });

        p431n = findViewById(R.id.p431n);
        p431n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P432.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });
    }
}