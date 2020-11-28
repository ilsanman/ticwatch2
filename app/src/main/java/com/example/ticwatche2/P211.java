package com.example.ticwatche2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class P211 extends WearableActivity {

    private Button p211y;
    private Button p211n;
    private int hintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p211);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Intent getIntent = getIntent();
        hintCount = (int) getIntent.getSerializableExtra("hintCount");

        p211y = findViewById(R.id.p211y);
        p211y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P221.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });

        p211n = findViewById(R.id.p211n);
        p211n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), P212.class);
                intent.putExtra("hintCount", hintCount);
                startActivity(intent);
                finish();
            }
        });
    }
}